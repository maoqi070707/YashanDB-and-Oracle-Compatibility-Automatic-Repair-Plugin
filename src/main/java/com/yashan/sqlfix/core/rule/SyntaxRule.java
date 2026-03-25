package com.yashan.sqlfix.core.rule;

public class SyntaxRule {
    public static String fixDualTable(String sql) {
        return sql.replaceAll("FROM\\s+DUAL", "FROM (SELECT 1 AS dummy)");
    }
    
    public static String fixRownum(String sql) {
        return sql.replaceAll("ROWNUM", "LIMIT 1");
    }
    
    public static String fixRowid(String sql) {
        return sql.replaceAll("ROWID", "ctid");
    }
    
    public static String fixSequenceSyntax(String sql) {
        sql = sql.replaceAll("([A-Za-z0-9_]+)\\.NEXTVAL", "nextval('$1')");
        sql = sql.replaceAll("([A-Za-z0-9_]+)\\.CURRVAL", "currval('$1')");
        return sql;
    }
    
    public static String fixTimestampLiteral(String sql) {
        return sql.replaceAll("TIMESTAMP\\s+\\'([^\\']+)\\'", "'$1'::timestamp");
    }
    
    public static String fixIntervalLiteral(String sql) {
        return sql.replaceAll("INTERVAL\\s+\\'([^\\']+)\\'\\s*([A-Z]+)", "'$1'::interval '$2'");
    }
    
    public static String fixDateLiteral(String sql) {
        return sql.replaceAll("DATE\\s+\\'([^\\']+)\\'", "'$1'::date");
    }
    
    public static String fixHierarchicalQuery(String sql) {
        // 简化的层级查询转换，实际可能需要更复杂的处理
        sql = sql.replaceAll("START\\s+WITH", "START WITH");
        sql = sql.replaceAll("CONNECT\\s+BY", "CONNECT BY");
        return sql;
    }
    
    public static String fixPartitionBy(String sql) {
        return sql.replaceAll("PARTITION\\s+BY", "PARTITION BY");
    }
    
    public static String fixUsingSyntax(String sql) {
        return sql.replaceAll("USING\\s+\\(", "USING (");
    }
    
    public static String applyAllSyntaxRules(String sql) {
        sql = fixDualTable(sql);
        sql = fixRownum(sql);
        sql = fixRowid(sql);
        sql = fixSequenceSyntax(sql);
        sql = fixTimestampLiteral(sql);
        sql = fixIntervalLiteral(sql);
        sql = fixDateLiteral(sql);
        sql = fixHierarchicalQuery(sql);
        sql = fixPartitionBy(sql);
        sql = fixUsingSyntax(sql);
        return sql;
    }
}