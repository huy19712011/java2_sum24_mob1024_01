package com.mycompany.java2_sum24_mob1024_01.jdbc.statement;

import com.mycompany.java2_sum24_mob1024_01.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateTableDemo {

    public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            statement = connection.createStatement();

            String sql = """
                            CREATE TABLE employee(
                                 Id INT NOT NULL,
                                 Name NVARCHAR(30) NOT NULL,
                                 Salary DECIMAL NOT NULL,
                                 PRIMARY KEY (Id)
                              );
                        """;

            statement.execute(sql);

            System.out.println("done...");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

}
