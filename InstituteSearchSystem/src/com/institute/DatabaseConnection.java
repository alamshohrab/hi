package com.institute;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/institute_db", "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    return connection;
    }
}

