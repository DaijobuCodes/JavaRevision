import java.sql.*;

public class DBactions {
    public void addRow(String name, float price) throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");

        Connection conn = DriverManager.
                getConnection("jdbc:h2:C:/Users/S81862/Desktop/yashdb", "sa", "");


//                TODO: Insert a new book
        Statement statement = conn.createStatement();
        String sql = "insert into books(name, price) values('"+name+"', "+price+")";
        int res = statement.executeUpdate(sql);
        System.out.println(res + " rows inserted.");

        this.displayTable();

        conn.close();
    }

    public void displayTable() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");

        Connection conn = DriverManager.
                getConnection("jdbc:h2:C:/Users/S81862/Desktop/yashdb", "sa", "");

        //        TODO: View all books
        Statement statement = conn.createStatement();
        String sql = "select * from books";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {

            System.out.println("Id=" + resultSet.getInt(1));
            System.out.println("Name=" + resultSet.getString(2));
            System.out.println("Price=" + resultSet.getFloat(3));
            System.out.println();
        }
    }

    public void updateRow(Integer id, String name, Float price) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");

        Connection conn = DriverManager.
                getConnection("jdbc:h2:C:/Users/S81862/Desktop/yashdb", "sa", "");

        //        TODO: Update a book
        Statement statement = conn.createStatement();
        String sql = "update books set  name = '"+name+"', price = "+price;
        int res = statement.executeUpdate(sql);
        System.out.println(res + " rows updated.");

        this.displayTable();

        conn.close();
    }

    public void deleteRow(Integer id) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");

        Connection conn = DriverManager.
                getConnection("jdbc:h2:C:/Users/S81862/Desktop/yashdb", "sa", "");

        //        TODO: Delete a book
        Statement statement = conn.createStatement();
        String sql = "delete from books where id = "+id;
        int res = statement.executeUpdate(sql);
        System.out.println(res + " rows deleted.");

        this.displayTable();
        conn.close();
    }



}
