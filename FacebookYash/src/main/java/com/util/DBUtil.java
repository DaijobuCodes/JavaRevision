package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("org.h2.Driver");
                connection = DriverManager.getConnection(
                        "jdbc:h2:C:\\Users\\Yash\\Desktop\\Java\\yashdb", "sa", ""
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    static {
        try {
            Class.forName("org.h2.Driver");
            System.out.println("Driver Loaded.");

            connection = DriverManager.getConnection(
                    "jdbc:h2:C:\\Users\\Yash\\Desktop\\Java\\yashdb", "sa", ""
            );
            System.out.println("Established Connection.");
        } catch (ClassNotFoundException e) {
            System.err.println("H2 Driver not found. Did you add it to your dependencies?");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection failed. Check path or file permissions.");
            e.printStackTrace();
        }
    }
}
