package com.mycompany.java2_sum24_mob1024_01.jdbc.callableStatement;

import com.mycompany.java2_sum24_mob1024_01.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertProcedureDemo {

    public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String proc = "{call insertEmployee(?, ?, ?)}";

            callableStatement = connection.prepareCall(proc);

            // gan gia tri
            callableStatement.setInt(1, 8);
            callableStatement.setString(2, "Ronaldo");
            callableStatement.setDouble(3, 100000);

            callableStatement.executeUpdate();

            System.out.println("done...");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

}
