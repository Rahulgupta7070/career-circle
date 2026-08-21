package Day_05.MethodChaining;

public class StudentDriver {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("shivam kumar")
                .setAge(22)
                .display();
    }
}
