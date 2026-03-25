package com.yashan.sqlfix.dto;

import java.util.List;

public class ScanResultDTO {
    private String originalSql;
    private List<IssueDTO> issues;
    private boolean hasIssues;
    
    public String getOriginalSql() {
        return originalSql;
    }
    
    public void setOriginalSql(String originalSql) {
        this.originalSql = originalSql;
    }
    
    public List<IssueDTO> getIssues() {
        return issues;
    }
    
    public void setIssues(List<IssueDTO> issues) {
        this.issues = issues;
        this.hasIssues = issues != null && !issues.isEmpty();
    }
    
    public boolean isHasIssues() {
        return hasIssues;
    }
}