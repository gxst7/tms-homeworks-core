package com.tms.lesson16.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConfiguration {

    public static Connection getConnection() {

        String url = "jdbc:postgresql://localhost:5432/";
        String database = "postgres";
        String userName = "postgres";
        String password = "";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url + database +
                    userName + password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
