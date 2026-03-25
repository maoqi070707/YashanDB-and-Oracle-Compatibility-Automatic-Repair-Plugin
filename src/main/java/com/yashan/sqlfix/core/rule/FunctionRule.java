package com.yashan.sqlfix.core.rule;

public class FunctionRule {
    public static String fixDecodeFunction(String sql) {
        return sql.replaceAll("DECODE\\s*\\(", "CASE(");
    }
    
    public static String fixNvlFunction(String sql) {
        return sql.replaceAll("NVL\\s*\\(", "COALESCE(");
    }
    
    public static String fixTrimFunction(String sql) {
        return sql.replaceAll("TRIM\\s*\\(", "TRIM(");
    }
    
    public static String fixSysdateFunction(String sql) {
        return sql.replaceAll("SYSDATE", "CURRENT_TIMESTAMP");
    }
    
    public static String fixToDateFunction(String sql) {
        return sql.replaceAll("TO_DATE\\s*\\(", "TO_TIMESTAMP(");
    }
    
    public static String fixToCharFunction(String sql) {
        return sql.replaceAll("TO_CHAR\\s*\\(", "CAST(");
    }
    
    public static String fixExtractFunction(String sql) {
        return sql.replaceAll("EXTRACT\\s*\\(", "EXTRACT(");
    }
    
    public static String fixRowNumFunction(String sql) {
        return sql.replaceAll("ROWNUM", "ROW_NUMBER() OVER ()");
    }
    
    public static String fixRankFunction(String sql) {
        return sql.replaceAll("RANK\\s*\\(", "RANK(");
    }
    
    public static String fixDenseRankFunction(String sql) {
        return sql.replaceAll("DENSE_RANK\\s*\\(", "DENSE_RANK(");
    }
    
    public static String fixLeadLagFunction(String sql) {
        sql = sql.replaceAll("LEAD\\s*\\(", "LEAD(");
        sql = sql.replaceAll("LAG\\s*\\(", "LAG(");
        return sql;
    }
    
    public static String fixListAggFunction(String sql) {
        return sql.replaceAll("LISTAGG\\s*\\(", "STRING_AGG(");
    }
    
    public static String fixRegexpSubstrFunction(String sql) {
        return sql.replaceAll("REGEXP_SUBSTR\\s*\\(", "SUBSTRING(");
    }
    
    public static String fixRegexpReplaceFunction(String sql) {
        return sql.replaceAll("REGEXP_REPLACE\\s*\\(", "REGEXP_REPLACE(");
    }
    
    public static String applyAllFunctionRules(String sql) {
        sql = fixDecodeFunction(sql);
        sql = fixNvlFunction(sql);
        sql = fixTrimFunction(sql);
        sql = fixSysdateFunction(sql);
        sql = fixToDateFunction(sql);
        sql = fixToCharFunction(sql);
        sql = fixExtractFunction(sql);
        sql = fixRowNumFunction(sql);
        sql = fixRankFunction(sql);
        sql = fixDenseRankFunction(sql);
        sql = fixLeadLagFunction(sql);
        sql = fixListAggFunction(sql);
        sql = fixRegexpSubstrFunction(sql);
        sql = fixRegexpReplaceFunction(sql);
        return sql;
    }
}