package Day7.MiniProject;

import java.util.Scanner;

class Booking extends BadmintonClass{
    Batch bd = new Batch();
    Scanner sc = new Scanner(System.in);

    public void bookBatch(User user,Batch[] batches){
            if(user.BookedBatchIndex != -1){
                System.out.println("You are already in a batch");
                user.currentBatch(batches);
            }
            else{
                bd.availableBatches(batches);
                System.out.println("Please select your required batch index: ");
                int slot_index = sc.nextInt();
                if(batches[slot_index].spots == 0) {
                    System.out.println("Please try another batch!");
                }
                else{
                    System.out.println("Your batch is successfully booked");
                    batches[slot_index].spots = batches[slot_index].spots-1;
                    user.BookedBatchIndex = slot_index;
                }
            }

    }

    public void cancelBatch(User user, Batch[] batches){
        System.out.println("Your batch is successfully Cancelled!");
        batches[user.BookedBatchIndex].spots +=1;
        user.BookedBatchIndex = -1;
    }


}
