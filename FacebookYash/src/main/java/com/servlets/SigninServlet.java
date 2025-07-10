package com.servlets;

import com.dao.UserDAO;
import com.dao.UserDAOImpl;
import com.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Signin")
public class SigninServlet extends HttpServlet {
    UserDAO userDAO = new UserDAOImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        HttpSession session = req.getSession(true);

        userDAO.addUser(new User(name, username, password, email));

        if(userDAO.checkPassword(username, password)){
            session.setAttribute("user", username);
            session.setAttribute("password", password);
            resp.sendRedirect(resp.encodeRedirectURL("home.jsp"));
        } else {
            resp.sendRedirect("http://localhost:8080/FacebookYash/");
        }

    }
}