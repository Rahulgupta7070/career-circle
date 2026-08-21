package Day_04.ConstructorOverloading;

public class Student {
    String name;
    int age;

    Student() {
        name = "Shivam";
        age = 20;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Shivam");
        Student s3 = new Student("Shivam", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}