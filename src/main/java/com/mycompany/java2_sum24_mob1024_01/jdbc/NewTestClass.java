package com.mycompany.java2_sum24_mob1024_01.jdbc;

import java.sql.Connection;

public class NewTestClass {

    public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        try {

            Connection connection = dcm.getConnection();
            System.out.println("Connected...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
