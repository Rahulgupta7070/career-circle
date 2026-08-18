package MethodChaining;

public class StudentDriver {
    public static void main(String[] args) {
            Student s1 = new Student()
                        .setName("imran")
                        .setAge(24)
                        .display();
    }
}