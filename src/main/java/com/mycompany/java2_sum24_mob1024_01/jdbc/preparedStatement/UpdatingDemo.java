package com.mycompany.java2_sum24_mob1024_01.jdbc.preparedStatement;

import com.mycompany.java2_sum24_mob1024_01.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatingDemo {

        public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            UPDATE employee
                            SET Salary=?, Name=?
                            WHERE Id = ?
                        """;

            preparedStatement = connection.prepareStatement(sql);

            // gan gia tri
            preparedStatement.setDouble(1, 95000);
            preparedStatement.setString(2, "Mike");
            preparedStatement.setInt(3, 1000);

            preparedStatement.executeUpdate();

            System.out.println("done...");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
