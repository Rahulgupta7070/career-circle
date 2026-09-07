package PredefineException.UncheckedException;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Object is null");
        }
        System.out.println("program continue");
    }
}
