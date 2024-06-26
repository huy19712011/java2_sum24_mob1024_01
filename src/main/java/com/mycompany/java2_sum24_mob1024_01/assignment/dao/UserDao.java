package com.mycompany.java2_sum24_mob1024_01.assignment.dao;

import com.mycompany.java2_sum24_mob1024_01.assignment.entity.User;
import com.mycompany.java2_sum24_mob1024_01.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>(); // khoi tao danh sach

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            SELECT * FROM users;
                         """;

            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                User user = new User();
                user.setId(resultSet.getInt("id")); // lay id tu resultset => chuyen cho user
                user.setName(resultSet.getString("name"));
                user.setPhone(resultSet.getString("phone"));
                user.setEmail(resultSet.getString("email"));

                users.add(user);

            }

            System.out.println("done...");
            return users;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;

    }

    public User getUserById(int id) {

        User user = new User();

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            SELECT * FROM users WHERE id=?;
                         """;

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                user.setId(resultSet.getInt("id")); // lay id tu resultset => chuyen cho user
                user.setName(resultSet.getString("name"));
                user.setPhone(resultSet.getString("phone"));
                user.setEmail(resultSet.getString("email"));
                break;

            }

            System.out.println("done...");
//            return user;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;

    }

    public void removeUserById(int id) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            DELETE users WHERE id=?;
                         """;

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

            System.out.println("done...");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void addUser(User user) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            INSERT INTO users(id, name, phone, email) VALUES(?, ?, ?, ?);
                         """;

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getPhone());
            preparedStatement.setString(4, user.getEmail());

            preparedStatement.executeUpdate();

            System.out.println("done...");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("test", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            UPDATE users SET name=?, phone=?, email=? WHERE id=?;
                         """;

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(4, user.getId());
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPhone());
            preparedStatement.setString(3, user.getEmail());

            preparedStatement.executeUpdate();

            System.out.println("done...");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
