package Day6.Appliances;

public class AllInOneDevice extends Appliances implements printable, scannable {

    private Printer printer;
    private Scanner scanner;

    public AllInOneDevice() {
        printer = new Printer();
        scanner = new Scanner();
    }

    @Override
    public void stats() {
        printer.stats();
    }

    @Override
    public void scans() {
        scanner.scans();
    }

    public void printDocs() {
        printer.printDocs();
    }

    public void scanDocs() {
        scanner.ScanDocs();
    }
}
