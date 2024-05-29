package com.mycompany.java2_sum24_mob1024_01.jdbc.preparedStatement;

import com.mycompany.java2_sum24_mob1024_01.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InsertingDemo {

    public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            INSERT INTO employee(Id, Name, Salary)
                            VALUES(?, ?, ?);
                        """;

            preparedStatement = connection.prepareStatement(sql);

            // gan gia tri
            preparedStatement.setInt(1, 1000);
            preparedStatement.setString(2, "Mary");
            preparedStatement.setDouble(3, 55000);

            preparedStatement.executeUpdate();

            System.out.println("done...");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

}
