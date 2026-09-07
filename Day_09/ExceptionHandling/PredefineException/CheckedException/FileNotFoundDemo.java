package PredefineException.CheckedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundDemo {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/Hp/OneDrive/Documents/Java write.txt");
            Scanner sc = new Scanner(file);

            System.out.println("File opened successfully");

        } catch (FileNotFoundException e) {
            System.out.println("File not found:(");
        }
        System.out.println("Program continue:)");
    }
}
