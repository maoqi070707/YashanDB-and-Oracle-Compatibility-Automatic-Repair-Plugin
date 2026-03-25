package com.yashan.sqlfix.service;

import com.yashan.sqlfix.dto.FixResultDTO;
import com.yashan.sqlfix.infra.FileReaderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class SqlBatchService {
    
    @Autowired
    private SqlConvertService sqlConvertService;
    
    @Autowired
    private SqlValidateService sqlValidateService;
    
    public List<FixResultDTO> processBatchFiles(MultipartFile[] files) {
        List<FixResultDTO> results = new ArrayList<>();
        
        for (MultipartFile file : files) {
            if (!file.isEmpty()) {
                FixResultDTO result = processSingleFile(file);
                results.add(result);
            }
        }
        
        return results;
    }
    
    private FixResultDTO processSingleFile(MultipartFile file) {
        FixResultDTO result = new FixResultDTO();
        
        try {
            // 保存上传的文件
            Path tempPath = Paths.get("temp_" + System.currentTimeMillis() + "_" + file.getOriginalFilename());
            Files.write(tempPath, file.getBytes());
            
            // 读取文件内容
            String sqlContent = FileReaderUtil.readSqlFile(tempPath.toString());
            
            // 转换SQL
            String fixedSql = sqlConvertService.convertToYashanSql(sqlContent);
            
            // 验证修复后的SQL
            boolean isValid = sqlValidateService.validateSql(fixedSql);
            
            result.setOriginalSql(sqlContent);
            result.setFixedSql(fixedSql);
            result.setSuccess(isValid);
            
            // 删除临时文件
            Files.deleteIfExists(tempPath);
            
        } catch (IOException e) {
            result.setOriginalSql("Error processing file: " + file.getOriginalFilename());
            result.setFixedSql(e.getMessage());
            result.setSuccess(false);
        }
        
        return result;
    }
    
    public List<FixResultDTO> processBatchSqls(List<String> sqlList) {
        List<FixResultDTO> results = new ArrayList<>();
        
        for (String sql : sqlList) {
            FixResultDTO result = new FixResultDTO();
            
            try {
                // 转换SQL
                String fixedSql = sqlConvertService.convertToYashanSql(sql);
                
                // 验证修复后的SQL
                boolean isValid = sqlValidateService.validateSql(fixedSql);
                
                result.setOriginalSql(sql);
                result.setFixedSql(fixedSql);
                result.setSuccess(isValid);
                
            } catch (Exception e) {
                result.setOriginalSql(sql);
                result.setFixedSql("Error: " + e.getMessage());
                result.setSuccess(false);
            }
            
            results.add(result);
        }
        
        return results;
    }
}