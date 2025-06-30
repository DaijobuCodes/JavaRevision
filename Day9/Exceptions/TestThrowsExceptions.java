package Day9.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrowsExceptions {

    int divide(int a, int b){
        return a / b;
    }

    void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("some-file");
    }

    public static void main(String[] args) throws FileNotFoundException {
        TestThrowsExceptions testThrowsException = new TestThrowsExceptions();
        testThrowsException.divide(10, 10);
        testThrowsException.readFile();
    }
}