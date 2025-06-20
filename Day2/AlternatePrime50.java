// Print the 1st 50 Alternate Prime Numbers
package Day2;

public class AlternatePrime50 {
    public static void main(String[] args){

        int count = 1;
        int num = 2;

        while(count<101){
            int i = 2;
            while(i < num){
                if(num%i == 0){
                    break;
                }
                i++;
            }
            if(i == num){
                count++;
                if(count%2 == 1){
                    System.out.println(i + " Count: " + count);
                }

            }
            num++;
        }
    }
}
