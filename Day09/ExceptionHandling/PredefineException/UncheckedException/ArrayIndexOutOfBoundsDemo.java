package PredefineException.UncheckedException;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        int numbres[] = { 10, 20, 30 };

        try {
            System.out.println(numbres[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }
        System.out.println("Program continues");
    }
}
