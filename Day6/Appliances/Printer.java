package Day6.Appliances;

public class Printer extends Appliances implements printable{
    public void printDocs(){
        System.out.println("I am printing your documents.");
    }

    public void stats(){
        System.out.println("This is the proof that it print");
    }
}
