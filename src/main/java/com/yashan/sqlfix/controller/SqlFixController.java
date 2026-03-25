package com.yashan.sqlfix.controller;

import com.yashan.sqlfix.dto.FixResultDTO;
import com.yashan.sqlfix.dto.ScanResultDTO;
import com.yashan.sqlfix.service.SqlConvertService;
import com.yashan.sqlfix.service.SqlScanService;
import com.yashan.sqlfix.service.SqlValidateService;
import com.yashan.sqlfix.service.SqlBatchService;
import com.yashan.sqlfix.infra.FileReaderUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api/sql")
public class SqlFixController {
    
    @Autowired
    private SqlScanService sqlScanService;
    
    @Autowired
    private SqlConvertService sqlConvertService;
    
    @Autowired
    private SqlValidateService sqlValidateService;
    
    @Autowired
    private SqlBatchService sqlBatchService;
    
    @PostMapping("/scan")
    public ResponseEntity<ScanResultDTO> scanSql(@RequestParam("sql") String sql) {
        ScanResultDTO result = new ScanResultDTO();
        result.setOriginalSql(sql);
        result.setIssues(sqlScanService.scanIncompatibleSql(sql));
        return ResponseEntity.ok(result);
    }
    
    @PostMapping("/convert")
    public ResponseEntity<FixResultDTO> convertSql(@RequestParam("sql") String sql) {
        FixResultDTO result = new FixResultDTO();
        result.setOriginalSql(sql);
        result.setFixedSql(sqlConvertService.convertToYashanSql(sql));
        result.setSuccess(true);
        return ResponseEntity.ok(result);
    }
    
    @PostMapping("/validate")
    public ResponseEntity<FixResultDTO> validateSql(@RequestParam("sql") String sql) {
        FixResultDTO result = new FixResultDTO();
        result.setOriginalSql(sql);
        
        boolean isValid = sqlValidateService.validateSql(sql);
        if (isValid) {
            result.setFixedSql(sql);
            result.setSuccess(true);
        } else {
            String error = sqlValidateService.getValidationError(sql);
            result.setFixedSql("Validation failed: " + error);
            result.setSuccess(false);
        }
        
        return ResponseEntity.ok(result);
    }
    
    @PostMapping("/upload")
    public ResponseEntity<FixResultDTO> uploadSqlFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        
        try {
            // 保存上传的文件
            Path tempPath = Paths.get("temp_" + System.currentTimeMillis() + ".sql");
            Files.write(tempPath, file.getBytes());
            
            // 读取文件内容
            String sqlContent = FileReaderUtil.readSqlFile(tempPath.toString());
            
            // 转换SQL
            FixResultDTO result = new FixResultDTO();
            result.setOriginalSql(sqlContent);
            result.setFixedSql(sqlConvertService.convertToYashanSql(sqlContent));
            result.setSuccess(true);
            
            // 删除临时文件
            Files.deleteIfExists(tempPath);
            
            return ResponseEntity.ok(result);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    
    @PostMapping("/batch/upload")
    public ResponseEntity<List<FixResultDTO>> batchUploadSqlFiles(@RequestParam("files") MultipartFile[] files) {
        if (files == null || files.length == 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        
        List<FixResultDTO> results = sqlBatchService.processBatchFiles(files);
        return ResponseEntity.ok(results);
    }
    
    @PostMapping("/batch/process")
    public ResponseEntity<List<FixResultDTO>> batchProcessSqls(@RequestBody List<String> sqlList) {
        if (sqlList == null || sqlList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        
        List<FixResultDTO> results = sqlBatchService.processBatchSqls(sqlList);
        return ResponseEntity.ok(results);
    }
    
    @GetMapping("/test-connection")
    public ResponseEntity<FixResultDTO> testConnection() {
        FixResultDTO result = new FixResultDTO();
        result.setOriginalSql("Test connection");
        
        String testResult = sqlValidateService.testConnection();
        if (testResult.contains("成功")) {
            result.setFixedSql(testResult);
            result.setSuccess(true);
        } else {
            result.setFixedSql(testResult);
            result.setSuccess(false);
        }
        
        return ResponseEntity.ok(result);
    }
}