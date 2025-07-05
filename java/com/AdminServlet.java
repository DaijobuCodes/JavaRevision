package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession(false);

        out.println("<h2> Welcome Admin! </h2>");
        out.println("<h2>Please Select your Task!</h2>");
        out.println("<form action = \"AddBook\" method=\"post\">\n" +
                "  <input type=\"submit\" value=\"Add a Book\">\n" +
                "</form>");
        out.println("<form action = \"DeleteBook\" method=\"post\">\n" +
                "    <input type=\"submit\" value=\"Delete a book\">\n" +
                "</form>");
        out.println("<form action = \"UpdateBook\" method=\"post\">\n" +
                "    <input type=\"submit\" value=\"Update a book\">\n" +
                "</form>");
        out.println("<form action = \"ViewBook\" method=\"post\">\n" +
                "    <input type=\"submit\" value=\"View all Books\">\n" +
                "</form>");
    }
}
