package com.mycompany.java2_sum24_mob1024_01.jdbc.statement;

import com.mycompany.java2_sum24_mob1024_01.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingRecordDemo {

        public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            statement = connection.createStatement();

            String sql = """
                            INSERT INTO employee(Id, Name, Salary)
                            VALUES(2, 'Mike', 60000);
                        """;

            statement.executeUpdate(sql);

            System.out.println("done...");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }


}
