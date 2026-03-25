package com.yashan.sqlfix.dto;

public class IssueDTO {
    private String description;
    private String level; // severe, medium, minor
    
    public IssueDTO(String description, String level) {
        this.description = description;
        this.level = level;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getLevel() {
        return level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }
}