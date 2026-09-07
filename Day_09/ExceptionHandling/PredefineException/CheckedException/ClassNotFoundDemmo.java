package PredefineException.CheckedException;

public class ClassNotFoundDemmo {
    public static void main(String[] args) {
        try {
            Class.forName("Student");
            System.out.println("Class found");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        System.out.println("Program continues");
    }
}
