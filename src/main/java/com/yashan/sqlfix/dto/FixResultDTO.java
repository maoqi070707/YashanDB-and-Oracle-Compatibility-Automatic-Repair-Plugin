package com.yashan.sqlfix.dto;

public class FixResultDTO {
    private String originalSql;
    private String fixedSql;
    private boolean success;
    
    public String getOriginalSql() {
        return originalSql;
    }
    
    public void setOriginalSql(String originalSql) {
        this.originalSql = originalSql;
    }
    
    public String getFixedSql() {
        return fixedSql;
    }
    
    public void setFixedSql(String fixedSql) {
        this.fixedSql = fixedSql;
    }
    
    public boolean isSuccess() {
        return success;
    }
    
    public void setSuccess(boolean success) {
        this.success = success;
    }
}