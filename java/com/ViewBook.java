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
import java.util.ArrayList;

@WebServlet("/ViewBook")
public class ViewBook extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        BookDAO bookDAO = new BookDAOImpl();


        HttpSession session = req.getSession(false);

        out.println("<h2> Welcome Admin! </h2>");
        out.println("<h1>The list of books are: </h2>");

        ArrayList<Book> books = (ArrayList<Book>) bookDAO.view();

        out.println("<table> <tr> <th> ID </th> <th> Name </th> <th> Price </th>");
        for (Book book : books) {
            out.println("<tr> <td> "+book.getId()+"</td><td>"+book.getName()+"</td><td>"+book.getPrice()+"</td></tr>");
        }
        out.println("</table>");
    }
}
