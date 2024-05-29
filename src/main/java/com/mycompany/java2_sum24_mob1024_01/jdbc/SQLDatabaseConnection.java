package com.mycompany.java2_sum24_mob1024_01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLDatabaseConnection {

    public static void main(String[] args) {

        String connectionUrl
                = "jdbc:sqlserver://localhost:1433;"
                + "database=test;"
                + "user=sa;"
                + "password=123456;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";
        try {
            Connection connection = DriverManager.getConnection(connectionUrl);

            System.out.println("Connected...");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
