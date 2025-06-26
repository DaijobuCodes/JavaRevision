package Day6.Appliances;

public class Main {
    public static void main(String[] args){
        AllInOneDevice device = new AllInOneDevice();
        device.printDocs();
        device.scanDocs();

        device.stats();
        device.scans();
    }
}
