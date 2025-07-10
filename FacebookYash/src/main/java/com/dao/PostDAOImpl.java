package com.dao;

import com.model.Post;
import com.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostDAOImpl implements PostDAO{

    @Override
    public int addPost(Post post, int uid, String username) {
        try {
            String sql = "insert into posts(uid, username, post, time) values(?, ?, ?, NOW(0))";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, uid);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, post.getPostContent());
            int res = 0;
            res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int addComment(Post book) {
        return 0;
    }

    @Override
    public List<Post> view() {
        List<Post> posts = new ArrayList<>();

        return (posts);
    }
}
