package com.yashan.sqlfix.core.rule;

public class TypeRule {
    public static String fixVarchar2Type(String sql) {
        return sql.replaceAll("VARCHAR2", "VARCHAR");
    }
    
    public static String fixNumberType(String sql) {
        return sql.replaceAll("NUMBER\\s*\\(", "INTEGER(");
    }
    
    public static String fixNumberWithoutPrecision(String sql) {
        return sql.replaceAll("NUMBER\\b", "NUMERIC");
    }
    
    public static String fixDateType(String sql) {
        return sql.replaceAll("DATE", "TIMESTAMP");
    }
    
    public static String fixTimestampType(String sql) {
        return sql.replaceAll("TIMESTAMP\\s*\\(", "TIMESTAMP(");
    }
    
    public static String fixClobType(String sql) {
        return sql.replaceAll("CLOB", "TEXT");
    }
    
    public static String fixBlobType(String sql) {
        return sql.replaceAll("BLOB", "BYTEA");
    }
    
    public static String applyAllTypeRules(String sql) {
        sql = fixVarchar2Type(sql);
        sql = fixNumberType(sql);
        sql = fixNumberWithoutPrecision(sql);
        sql = fixDateType(sql);
        sql = fixTimestampType(sql);
        sql = fixClobType(sql);
        sql = fixBlobType(sql);
        return sql;
    }
}