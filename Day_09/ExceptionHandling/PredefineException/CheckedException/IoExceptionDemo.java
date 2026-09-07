package PredefineException.CheckedException;

import java.io.FileReader;

public class IoExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("abc.txt");
            int data = fr.read();
            System.out.println("file data: " + (char) data);
            fr.close();
        } catch (Exception e) {
            System.out.println("Input/Output error occurred");
        }
        System.out.println("program cotinues");
    }
}
