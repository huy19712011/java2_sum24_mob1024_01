package com.mycompany.java2_sum24_mob1024_01.jdbc.statement;

import com.mycompany.java2_sum24_mob1024_01.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

            public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            statement = connection.createStatement();

            String sql = """
                            UPDATE employee
                            SET Name = 'Other Name', Salary = 75000
                            WHERE Id = 1
                        """;

            statement.executeUpdate(sql);

            System.out.println("done...");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

}
