package com.dao;

import com.model.User;
import com.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class UserDAOImpl implements UserDAO{
    @Override
    public int addUser(User user) {
        try {
            String sql = "insert into appusers(name, username, password, email) values(?, ?, ?, ?)";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getEmail());
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }


    @Override
    public int getUserID(String username) {
        int id = -1;
        try {
            Statement statement = DBUtil.getConnection().createStatement();
            String sql = "select * from appusers where username='" + username + "'";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                id = resultSet.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public String getUserEmail(String username){
        String email = "";
        try {
            Statement statement = DBUtil.getConnection().createStatement();
            String sql = "select email from appusers where username='" + username + "'";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                email = resultSet.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return email;
    }

    @Override
    public boolean isExist(String username) {
        boolean res = false;
        try {
            Statement statement = DBUtil.getConnection().createStatement();
            String sql = "select username from appusers where username='" + username + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                res = true;
                return res;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public boolean checkPassword(String username, String password) {
        try {
            Statement statement = DBUtil.getConnection().createStatement();
            String sql = "SELECT password FROM appusers WHERE username=?";
            PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql);
            ps.setString(1, username);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                System.out.println(username + password);
                if (password.equals(resultSet.getString(1))) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
