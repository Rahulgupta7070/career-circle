package PredefineException.UncheckedException;

public class StudentEx {
    public static void main(String[] args) {

        Student s = new Student();
        // System.out.println(s.name);
        // s = null;
        // s.display();

        try {
            System.out.println(s.name);
            s = null;
            s.display();
        } catch (NullPointerException e) {
            System.out.println("Student object is null");
        }
        System.out.println("program is continue");

    }
}
