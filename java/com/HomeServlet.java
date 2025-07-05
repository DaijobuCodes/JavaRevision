package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession(false);

        if(session != null && session.getAttribute("user").equals("Admin") && session.getAttribute("password").equals("admin123")){
            req.getRequestDispatcher("/admin").forward(req, resp);
        }
        else{
            resp.sendRedirect("http://localhost:8080/BookStoreWeb/");
        }
    }
}
