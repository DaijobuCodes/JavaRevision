package bookstore.dao;

import bookstore.model.Book;
import bookstore.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDAOImpl implements BookDAO {
    @Override
    public int insert(Book book) {
        try {
            String sql = "insert into books(name, price) values(?, ?)";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, book.getName());
            preparedStatement.setFloat(2, book.getPrice());
            int res = 0;
            res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Book> view() {
        List<Book> books = new ArrayList<>();
        try {
            Statement statement = DBUtil.getConnection().createStatement();
            String sql = "select * from books";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next())
                books.add(new Book(
                                    resultSet.getInt(1),
                                    resultSet.getString(2),
                                    resultSet.getFloat(3))
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public int delete(int id) {
        try {
            Statement statement = DBUtil.getConnection().createStatement();
            String sql = "delete from books where id = "+id;
            int res = statement.executeUpdate(sql);
            System.out.println(res + " rows deleted.");

            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int update(Book book) {
        try {
            String sql = "update books set name = ?, price = ? where id = ?";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, book.getName());
            preparedStatement.setFloat(2, book.getPrice());
            preparedStatement.setInt(3, book.getId());
            int res = 0;
            res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Book view(int id) {
        ArrayList<Book> books = (ArrayList<Book>) this.view();
        int count = -1;
        for(Book book : books){
            if(book.getId() == id){
                count++;
                return book;
            }
        }
        if(count == -1){
            System.out.println("No such book exists");
        }
        return null;
    }

    @Override
    public List<Book> view(String name) {
        List<Book> books = new ArrayList<>();
        try {
            String sql = "select * from books where name = ?";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
                books.add(new Book(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getFloat(3))
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(!books.isEmpty()){
            return books;
        }
        System.out.println("No book Exist with that name.");
        return null;
    }


}