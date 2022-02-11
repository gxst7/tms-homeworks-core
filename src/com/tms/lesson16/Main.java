package com.tms.lesson16;

import com.tms.lesson16.config.JDBCConfiguration;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Connection connection = JDBCConfiguration.getConnection();

        System.out.println();
    }
}
