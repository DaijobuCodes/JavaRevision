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

@WebServlet("/UpdateBook")
public class UpdateBook extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        BookDAO bookDAO = new BookDAOImpl();


        HttpSession session = req.getSession(false);

        out.println("<h2> Welcome Admin! </h2>");
        out.println("<form action = \"UpdateBook\" method=\"post\">\n" +
                "\n" +
                "  <h2>Please Enter the book details</h2>\n" +
                "  <label>Book ID</label>\n" +
                "  <input type=\"number\" name=\"bookid\" placeholder=\"Enter book ID\" required><br><br>\n" +
                "  <label>Book Name</label>\n" +
                "  <input type=\"text\" name=\"bookname\" placeholder=\"Enter bookname\" required><br><br>\n" +
                "  <label>Price</label>\n" +
                "  <input type=\"number\" name=\"price\" placeholder=\"Enter book price\" required><br><br>\n" +
                "  <input type=\"submit\" value=\"Add Book\">\n" +
                "</form>");

        int id = Integer.parseInt(req.getParameter("bookid"));
        String bookname = req.getParameter("bookname");
        float price = Float.parseFloat(req.getParameter("price"));

        int res = bookDAO.update(new Book(id, bookname, price));
    }
}
