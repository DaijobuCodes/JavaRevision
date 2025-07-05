package com;

import com.dao.BookDAO;
import com.dao.BookDAOImpl;
import com.model.Book;
import com.util.DBUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/DeleteBook")
public class DeleteBook extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        BookDAO bookDAO = new BookDAOImpl();


        HttpSession session = req.getSession(false);

        out.println("<h2> Welcome Admin! </h2>");
        out.println("<form action = \"DeleteBook\" method=\"post\">\n" +
                "\n" +
                "  <h2>Please Enter the book details</h2>\n" +
                "  <label>Book ID you want to delete</label>\n" +
                "  <input type=\"text\" name=\"bookid\" placeholder=\"Enter book ID\" required><br><br>\n" +
                "  <input type=\"submit\" value=\"submit\">\n" +
                "</form>");

        int id = Integer.parseInt(req.getParameter("bookid"));

        int res = bookDAO.delete(id);

    }
}
