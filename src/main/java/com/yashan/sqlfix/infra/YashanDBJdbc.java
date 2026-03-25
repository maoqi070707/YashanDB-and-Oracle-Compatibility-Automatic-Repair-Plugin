package com.yashan.sqlfix.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.sql.Driver;

public class YashanDBJdbc {
    private static final String URL = "jdbc:yashandb://localhost:12888/test";
    private static final String USER = "sys";
    private static final String PASSWORD = "sys";
    
    static {
        System.out.println("=== YashanDBJdbc 静态初始化块开始 ===");
        try {
            System.out.println("1. 正在加载YashanDB驱动...");
            System.out.println("2. 尝试加载类: com.yashandb.jdbc.Driver");
            Class<?> driverClass = Class.forName("com.yashandb.jdbc.Driver");
            System.out.println("3. 驱动类加载成功: " + driverClass.getName());
            
            // 注册驱动
            Driver driver = (Driver) driverClass.newInstance();
            DriverManager.registerDriver(driver);
            System.out.println("4. 驱动注册成功！");
            
            // 打印所有注册的驱动
            System.out.println("5. 注册的驱动列表：");
            Enumeration<Driver> drivers = DriverManager.getDrivers();
            while (drivers.hasMoreElements()) {
                Driver d = drivers.nextElement();
                System.out.println("   - " + d.getClass().getName());
            }
            
            System.out.println("6. YashanDB驱动加载完成！");
        } catch (ClassNotFoundException e) {
            System.err.println("错误：找不到YashanDB驱动类");
            System.err.println("错误信息：" + e.getMessage());
            e.printStackTrace();
        } catch (InstantiationException e) {
            System.err.println("错误：无法实例化驱动类");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.err.println("错误：无法访问驱动类");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("错误：注册驱动失败");
            e.printStackTrace();
        } finally {
            System.out.println("=== YashanDBJdbc 静态初始化块结束 ===");
        }
    }
    
    public static Connection getConnection() throws SQLException {
        System.out.println("=== 获取数据库连接 ===");
        System.out.println("连接URL: " + URL);
        System.out.println("用户名: " + USER);
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("连接成功！Connection: " + conn);
            return conn;
        } catch (SQLException e) {
            System.err.println("连接失败：" + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }
    
    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("连接已关闭");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}