package com.yashan.sqlfix.service;

import com.yashan.sqlfix.core.SqlFixEngine;
import com.yashan.sqlfix.core.rule.FunctionRule;
import com.yashan.sqlfix.core.rule.SyntaxRule;
import com.yashan.sqlfix.core.rule.TypeRule;
import com.yashan.sqlfix.dto.IssueDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SqlScanService {
    public List<IssueDTO> scanIncompatibleSql(String sql) {
        List<IssueDTO> issues = new ArrayList<>();
        
        if (sql.contains("DECODE")) {
            issues.add(new IssueDTO("Found DECODE function, should be replaced with CASE", "medium"));
        }
        
        if (sql.contains("NVL")) {
            issues.add(new IssueDTO("Found NVL function, should be replaced with COALESCE", "medium"));
        }
        
        if (sql.contains("DUAL")) {
            issues.add(new IssueDTO("Found DUAL table, should be replaced with subquery", "severe"));
        }
        
        if (sql.contains("ROWNUM")) {
            issues.add(new IssueDTO("Found ROWNUM, should be replaced with LIMIT", "medium"));
        }
        
        if (sql.contains("VARCHAR2")) {
            issues.add(new IssueDTO("Found VARCHAR2 type, should be replaced with VARCHAR", "minor"));
        }
        
        if (sql.contains("NUMBER")) {
            issues.add(new IssueDTO("Found NUMBER type, should be replaced with INTEGER", "minor"));
        }
        
        if (sql.contains("SYSDATE")) {
            issues.add(new IssueDTO("Found SYSDATE function, should be replaced with CURRENT_TIMESTAMP", "medium"));
        }
        
        if (sql.contains("TO_DATE")) {
            issues.add(new IssueDTO("Found TO_DATE function, should be replaced with TO_TIMESTAMP", "medium"));
        }
        
        if (sql.contains("TO_CHAR")) {
            issues.add(new IssueDTO("Found TO_CHAR function, should be replaced with CAST", "medium"));
        }
        
        return issues;
    }
}