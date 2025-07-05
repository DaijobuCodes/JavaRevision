package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession(true);
        if(username != null){
            session.setAttribute("user", username);
            session.setAttribute("password", password);
            req.getRequestDispatcher("/home").forward(req, resp);
        }
//        out.println("<h1>Welcome, " + session.getAttribute("user") + "</h1>");
//        out.println("<h1>Password: "+password+"</h1>");
//        out.println("<h2>Session id: "+session.getId()+"</h2>");
    }
}
