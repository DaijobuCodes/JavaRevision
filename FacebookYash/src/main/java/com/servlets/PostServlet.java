package com.servlets;

import com.dao.PostDAO;
import com.dao.PostDAOImpl;
import com.dao.UserDAO;
import com.dao.UserDAOImpl;
import com.model.Post;
import com.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Postserv")
public class PostServlet extends HttpServlet {
    UserDAO userDAO = new UserDAOImpl();
    PostDAO postDAO = new PostDAOImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String content = req.getParameter("content");

        HttpSession session = req.getSession(true);

        String username = (String)session.getAttribute("user");
        int userid = userDAO.getUserID(username);

        postDAO.addPost(new Post(content), userid, username);

        resp.sendRedirect(resp.encodeRedirectURL("home.jsp"));

    }
}