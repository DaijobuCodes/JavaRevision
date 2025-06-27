package Day7.MiniProject;

import java.util.Scanner;

public class Main extends BadmintonClass{
    public static void main(String[] args){

        Batch[] batchs = new Batch[5];
        batchs[0] = new Batch("5 AM", 4);
        batchs[1] = new Batch("7 AM", 5);
        batchs[2] = new Batch("9 AM", 2);
        batchs[3] = new Batch("11 AM", 7);
        batchs[4] = new Batch("2 PM", 4);

        Scanner sc = new Scanner(System.in);
        User user = new User();
        Batch batch = new Batch();
        Booking booking = new Booking();
        BadmintonClass badmintonClass = new BadmintonClass();

        System.out.println("WELCOME TO "+ badmintonClass.ACADAMYNAME.toUpperCase()+ " !");

        while(true){
            System.out.println();
            System.out.println("Select your option: ");
            System.out.println("1. To make user");
            System.out.println("2. To book a spot in Batch");
            System.out.println("3. Check Available spots and batches");
            System.out.println("4. Cancel the booking");
            System.out.println("5. Check user details");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Please enter the name: ");
                    user.setName(sc.nextLine());
                    System.out.println("YAY! You are successfully registered Mr/Miss "+ user.name);
                    break;
                case 2:
                    booking.bookBatch(user, batchs);
                    break;
                case 3:
                    batch.availableBatches(batchs);
                    break;
                case 4:
                    booking.cancelBatch(user, batchs);
                    batch.availableBatches(batchs);
                    break;
                case 5:
                    System.out.print("Name: "+ user.name + " ");
                    user.currentBatch(batchs);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Please try the valid option.");
                    break;
            }
        }
    }
}