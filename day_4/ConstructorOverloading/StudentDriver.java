package ConstructorOverloading;

public class StudentDriver {
    public static void main(String[] args) {
        //Student s1 =new Student();
        //Student s2 =new Student("Imran");
        Student s3 =new Student("Imran", 25);
        s3.printDetails();
    }
}