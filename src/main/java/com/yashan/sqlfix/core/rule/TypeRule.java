package com.yashan.sqlfix.core.rule;

public class TypeRule implements Rule {
    @Override
    public String apply(String sql) {
        String result = sql;
        // 转换Oracle类型到YashanDB类型
        result = result.replace("VARCHAR2", "VARCHAR");
        result = result.replace("NUMBER", "INTEGER");
        result = result.replace("DATE", "TIMESTAMP");
        result = result.replace("CLOB", "TEXT");
        result = result.replace("BLOB", "BYTEA");
        result = result.replace("PLS_INTEGER", "INTEGER");
        return result;
    }
    
    @Override
    public boolean canApply(String sql) {
        return sql.contains("VARCHAR2") || sql.contains("NUMBER") || 
               sql.contains("DATE") || sql.contains("CLOB") || 
               sql.contains("BLOB") || sql.contains("PLS_INTEGER");
    }
}