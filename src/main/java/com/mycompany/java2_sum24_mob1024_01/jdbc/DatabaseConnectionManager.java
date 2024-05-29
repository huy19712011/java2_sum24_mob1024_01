package com.mycompany.java2_sum24_mob1024_01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    private final String url;

    public DatabaseConnectionManager(String databaseName, String username, String password) {

        this.url = "jdbc:sqlserver://localhost:1433;database=" + databaseName
                + ";user=" + username
                + ";password=" + password
                + ";encrypt=true;" + "trustServerCertificate=true;" + "loginTimeout=30;";
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url);
    }

}
