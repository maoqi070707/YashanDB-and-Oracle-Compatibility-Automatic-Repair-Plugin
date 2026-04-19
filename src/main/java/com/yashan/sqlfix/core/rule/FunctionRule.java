package com.yashan.sqlfix.core.rule;

public class FunctionRule implements Rule {
    @Override
    public String apply(String sql) {
        String result = sql;
        // 转换Oracle函数到YashanDB函数
        result = result.replace("DECODE(", "CASE(");
        result = result.replace("NVL(", "COALESCE(");
        result = result.replace("SYSDATE", "CURRENT_TIMESTAMP");
        result = result.replace("TO_DATE(", "TO_TIMESTAMP(");
        result = result.replace("TO_CHAR(", "CAST(");
        return result;
    }
    
    @Override
    public boolean canApply(String sql) {
        return sql.contains("DECODE(") || sql.contains("NVL(") || 
               sql.contains("SYSDATE") || sql.contains("TO_DATE(") || 
               sql.contains("TO_CHAR(");
    }
}