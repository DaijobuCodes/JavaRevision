package com.dao;

import com.model.User;

public interface UserDAO {
    int addUser(User user);
    int getUserID(String username);

    boolean checkPassword(String username, String password);
}