package com.yashan.sqlfix.service;

import com.yashan.sqlfix.core.SqlFixEngine;
import com.yashan.sqlfix.core.rule.FunctionRule;
import com.yashan.sqlfix.core.rule.SyntaxRule;
import com.yashan.sqlfix.core.rule.TypeRule;
import org.springframework.stereotype.Service;

@Service
public class SqlConvertService {
    private final SqlFixEngine sqlFixEngine = new SqlFixEngine();
    
    public String convertToYashanSql(String oracleSql) {
        // 处理空输入
        if (oracleSql == null || oracleSql.isEmpty()) {
            return oracleSql;
        }
        
        // 使用AST解析器进行更准确的SQL转换
        String fixedSql = convertWithAst(oracleSql);
        
        // 确保fixedSql不为null
        if (fixedSql == null) {
            fixedSql = oracleSql;
        }
        
        return fixedSql;
    }
    
    public String convertWithAst(String oracleSql) {
        return sqlFixEngine.fixSql(oracleSql);
    }
}