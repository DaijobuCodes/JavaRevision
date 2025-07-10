package com.dao;

import com.model.User;

public interface UserDAO {
    int addUser(User user);
    int getUserID(String username);
    String getUserEmail(String username);
    boolean isExist(String username);
    boolean checkPassword(String username, String password);
}