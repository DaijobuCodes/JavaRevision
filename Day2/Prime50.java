// Print 1st 50 Prime Numbers
package Day2;

public class Prime50 {
    public static void main(String[] args){

        int count = 1;
        int num = 2;

        while(count<51){
            int i = 2;
            while(i < num){
                if(num%i == 0){
                    break;
                }
                i++;
            }
            if(i == num){
                System.out.println(i + " Count: " + count);
                count++;
            }
            num++;
        }
    }
}
