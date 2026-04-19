package com.yashan.sqlfix.core.rule;

public class SyntaxRule implements Rule {
    @Override
    public String apply(String sql) {
        String result = sql;
        // 转换DUAL表
        result = result.replace("dual", "(SELECT 1 AS dummy)");
        // 转换存储过程、函数和触发器定义
        result = result.replace("CREATE PROCEDURE", "CREATE OR REPLACE PROCEDURE");
        result = result.replace("CREATE FUNCTION", "CREATE OR REPLACE FUNCTION");
        result = result.replace("CREATE TRIGGER", "CREATE OR REPLACE TRIGGER");
        return result;
    }
    
    @Override
    public boolean canApply(String sql) {
        return sql.contains("dual") || 
               sql.contains("CREATE PROCEDURE") || sql.contains("CREATE FUNCTION") || 
               sql.contains("CREATE TRIGGER");
    }
}