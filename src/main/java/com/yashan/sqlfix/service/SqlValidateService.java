package com.yashan.sqlfix.service;

import com.yashan.sqlfix.infra.YashanDBJdbc;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class SqlValidateService {
    
    public boolean validateSql(String sql) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = YashanDBJdbc.getConnection();
            
            // 检查SQL类型，对于SELECT语句直接执行，其他语句使用EXPLAIN
            if (sql.trim().toUpperCase().startsWith("SELECT")) {
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();
                // 只是验证SQL是否能正常执行，不需要处理结果
                return true;
            } else {
                // 对于非SELECT语句，使用EXPLAIN来验证语法
                String explainSql = "EXPLAIN " + sql;
                stmt = conn.prepareStatement(explainSql);
                rs = stmt.executeQuery();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) YashanDBJdbc.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public String getValidationError(String sql) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = YashanDBJdbc.getConnection();
            
            if (sql.trim().toUpperCase().startsWith("SELECT")) {
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();
                return null; // 验证成功
            } else {
                String explainSql = "EXPLAIN " + sql;
                stmt = conn.prepareStatement(explainSql);
                rs = stmt.executeQuery();
                return null; // 验证成功
            }
        } catch (SQLException e) {
            String errorMessage = e.getMessage();
            if (errorMessage.contains("No suitable driver found")) {
                return "数据库连接失败：请确保YashanDB服务正在运行，并且连接配置正确。\n\n" +
                       "可能的原因：\n" +
                       "1. YashanDB服务未启动\n" +
                       "2. 连接端口(12888)错误\n" +
                       "3. 数据库(test)不存在\n" +
                       "4. 网络连接问题";
            } else if (errorMessage.contains("Connection refused")) {
                return "数据库连接被拒绝：请确保YashanDB服务正在运行，并且网络连接正常。";
            } else if (errorMessage.contains("Unknown database")) {
                return "数据库不存在：请确保指定的数据库(test)已创建。";
            } else {
                return "验证失败：" + errorMessage;
            }
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) YashanDBJdbc.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * 测试数据库连接
     * @return 连接状态信息
     */
    public String testConnection() {
        Connection conn = null;
        try {
            conn = YashanDBJdbc.getConnection();
            return "数据库连接成功！";
        } catch (SQLException e) {
            String errorMessage = e.getMessage();
            if (errorMessage.contains("No suitable driver found")) {
                return "数据库连接失败：请确保YashanDB服务正在运行，并且连接配置正确。\n\n" +
                       "可能的原因：\n" +
                       "1. YashanDB服务未启动\n" +
                       "2. 连接端口(12888)错误\n" +
                       "3. 数据库(test)不存在\n" +
                       "4. 网络连接问题";
            } else {
                return "连接测试失败：" + errorMessage;
            }
        } finally {
            if (conn != null) {
                YashanDBJdbc.closeConnection(conn);
            }
        }
    }
}