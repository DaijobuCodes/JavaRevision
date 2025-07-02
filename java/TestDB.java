import org.h2.util.json.JsonConstructorUtils;

import java.sql.*;
import java.util.Scanner;

public class TestDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        DBactions dBactions = new DBactions();

        while(true){
            System.out.println("Select the option");
            System.out.println("1. Add a Row");
            System.out.println("2. Update a Row");
            System.out.println("3. Delete a Row");
            System.out.println("4. Display Table");
            System.out.println("5. Exit");

            System.out.print("Enter the choce: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter the name of book: ");
                    String book_name = sc.nextLine();

                    System.out.print("Enter the price of the book: ");
                    float price = sc.nextFloat();
                    sc.nextLine();

                    dBactions.addRow(book_name, price);
                    break;
                case 2:
                    System.out.print("Enter the new name of book: ");
                    String new_book_name = sc.nextLine();

                    System.out.print("Enter the new price of the book: ");
                    float new_price = sc.nextFloat();
                    sc.nextLine();

                    System.out.println("Enter the Id: ");
                    int id = sc.nextInt();

                    dBactions.updateRow(id, new_book_name, new_price);
                    break;

                case 3:
                    System.out.println("Enter the Id: ");
                    int del_id = sc.nextInt();

                    dBactions.deleteRow(del_id);
                    break;

                case 4:
                    System.out.println("=====Printing Book Row=====");
                    dBactions.displayTable();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Please enter a valid input");
            }
        }
    }
}