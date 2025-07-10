package com.servlets;

import com.dao.UserDAO;
import com.dao.UserDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    UserDAO userDAO = new UserDAOImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession(true);

        session.setAttribute("user", username);
        session.setAttribute("password", password);

        if(userDAO.checkPassword((String)session.getAttribute("password"), (String)session.getAttribute("username"))){
            req.getRequestDispatcher("home.jsp").forward(req, resp);
        }
        else{
            resp.sendRedirect("http://localhost:8080/FacebookYash/");
        }
    }
}