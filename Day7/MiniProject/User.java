package Day7.MiniProject;

public class User extends BadmintonClass{
    protected String name;
    protected int BookedBatchIndex = -1;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void currentBatch(Batch[] batches){
        if(this.BookedBatchIndex == -1){
            System.out.println("No batch");
        }
        else{
            for(int i=0; i<batches.length; i++){
                if(i == this.BookedBatchIndex){
                    System.out.println("Your batch is: "+ batches[i].slot);
                }
            }
        }
    }


}
