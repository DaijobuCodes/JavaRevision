package com.servlets;

import com.dao.PostDAO;
import com.dao.PostDAOImpl;
import com.dao.UserDAO;
import com.dao.UserDAOImpl;
import com.model.Comment;
import com.model.Post;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Commentserv")
public class CommentServlet extends HttpServlet {
    UserDAO userDAO = new UserDAOImpl();
    PostDAO postDAO = new PostDAOImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String comment_content = req.getParameter("comment_content");
        int post_id = Integer.parseInt(req.getParameter("post_id"));
        HttpSession session = req.getSession(true);
        String username = (String)session.getAttribute("user");
        int userid = userDAO.getUserID(username);

        postDAO.addComment(new Comment(post_id, userid, comment_content));

        resp.sendRedirect(resp.encodeRedirectURL("home.jsp"));

    }
}
