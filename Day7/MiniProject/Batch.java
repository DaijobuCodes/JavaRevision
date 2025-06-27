package Day7.MiniProject;

public class Batch extends BadmintonClass {
    protected String slot;
    protected int spots;

    public Batch(String slot, int spots){
        this.slot = slot;
        this.spots = spots;
    }

    public Batch(){

    }

    public void availableBatches(Batch[] b){
        int index = 0;
        System.out.println("The Batches are: ");
        for(Batch i : b){
            if(i.spots == 0){
                System.out.println(index+". Batch is Full");
                index++;
            }
            else{
                System.out.println(index + ". " + i.slot + " Batch is available with spots: " +i.spots);
                index++;
            }
        }
    }
}
