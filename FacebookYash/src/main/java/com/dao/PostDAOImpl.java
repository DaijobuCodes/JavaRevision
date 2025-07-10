package com.dao;

import com.model.Comment;
import com.model.Post;
import com.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

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
    public int addComment(Comment comment) {
        try {
            String sql = "insert into comments(pid, uid, comment, time) values(?, ?, ?, NOW(0))";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, comment.getPostID());
            preparedStatement.setInt(2, comment.getUserID());
            preparedStatement.setString(3, comment.getCommentContent());
            int res = 0;
            res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Map<String, String>> getPostCommentRows() {
        List<Map<String, String>> resultList = new ArrayList<>();
        String sql = "SELECT p.pid, p.username AS postUser, p.post, p.time AS postTime, " +
                "c.comment, c.time AS commentTime, a.username AS commentUser " +
                "FROM posts p " +
                "INNER JOIN comments c ON p.pid = c.pid " +
                "INNER JOIN appusers a ON c.uid = a.uid " +
                "ORDER BY p.pid, c.time";

        try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Map<String, String> row = new HashMap<>();
                row.put("pid", rs.getString("pid"));
                row.put("postUser", rs.getString("postUser"));
                row.put("post", rs.getString("post"));
                row.put("postTime", rs.getString("postTime"));
                row.put("commentUser", rs.getString("commentUser"));
                row.put("comment", rs.getString("comment"));
                row.put("commentTime", rs.getString("commentTime"));
                resultList.add(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultList;
    }

}
