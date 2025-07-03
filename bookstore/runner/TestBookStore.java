package bookstore.runner;

import bookstore.dao.BookDAO;
import bookstore.dao.BookDAOImpl;
import bookstore.model.Book;

import java.util.Scanner;

public class TestBookStore {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOImpl();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Select an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Delete the book");
            System.out.println("3. Update an entry");
            System.out.println("4. View all books");
            System.out.println("5. View by ID");
            System.out.println("6. View by Name");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter id of book: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter name of he book: ");
                    String name = sc.nextLine();
                    System.out.println("Enter price of the book: ");
                    float price = sc.nextFloat();
                    sc.nextLine();
                    int res = bookDAO.insert(new Book(id, name, price));
                    System.out.println(res + " books inserted");
                    bookDAO.view().forEach(System.out::println);
                    break;

                case 2:
                    System.out.println("Enter the id to delete: ");
                    int idToDelete = sc.nextInt();
                    int result = bookDAO.delete(idToDelete);
                    System.out.println(result + " books inserted");
                    bookDAO.view().forEach(System.out::println);
                    break;

                case 3:
                    System.out.println("Enter the id of the book: ");
                    int idToUpdate = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the new name of the book: ");
                    String nameToUpdate = sc.nextLine();
                    System.out.println("Enter the new price of the book: ");
                    float priceToUpdate = sc.nextFloat();

                    int results = bookDAO.update(new Book(idToUpdate, nameToUpdate, priceToUpdate));
                    bookDAO.view().forEach(System.out::println);
                    break;

                case 4:
                    bookDAO.view().forEach(System.out::println);
                    break;

                case 5:
                    System.out.println("Enter the id to search for the book: ");
                    int idToLook = sc.nextInt();
                    System.out.println(bookDAO.view(idToLook));
                    break;

                case 6:
                    System.out.println("Enter the name to search for the book: ");
                    String nameToLook = sc.nextLine();
                    System.out.println(bookDAO.view(nameToLook));
                    break;

                case 7:
                    return;

                case 8:
                    System.out.println("Please give a valid input");
                    break;
            }
        }
//        TODO: Insert a new book using DAO
//        int res = bookDAO.insert(new Book(0, "Thinking in Java", 350.5f));
//        System.out.println(res + " books inserted");

//        TODO: View Books
//         bookDAO.view().forEach(System.out::println);

//        TODO: Update the entry
//        System.out.println("Enter the id of the book: ");
//        int id = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter the new name of the book: ");
//        String name = sc.nextLine();
//        System.out.println("Enter the new price of the book: ");
//        float price = sc.nextFloat();
//
//        int res = bookDAO.update(new Book(id, name, price));
//        bookDAO.view().forEach(System.out::println);

        //        TODO: Search by ID
//        System.out.println("Enter the id to search for the book: ");
//        int id = sc.nextInt();
//        System.out.println(bookDAO.view(id));

        // TODO: Search by name
//        System.out.println("Enter the name to search for the book: ");
//        String name = sc.nextLine();
//        System.out.println(bookDAO.view(name));

       }
}