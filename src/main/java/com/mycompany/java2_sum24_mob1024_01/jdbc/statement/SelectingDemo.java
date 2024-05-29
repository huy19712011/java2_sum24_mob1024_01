package com.mycompany.java2_sum24_mob1024_01.jdbc.statement;

import com.mycompany.java2_sum24_mob1024_01.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectingDemo {

        public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            statement = connection.createStatement();

            String sql = """
                            SELECT Id, Name, Salary FROM employee;
                        """;

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println("Employee Id: " + resultSet.getInt("Id"));
                System.out.println("Employee Name: " + resultSet.getString("Name"));
                System.out.println("Employee Salary: " + resultSet.getDouble("Salary"));
            }

            System.out.println("done...");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

}
