class Student {
    String name;
    int age;

    Student() {
        System.out.println("Default Constructor");
    }
    Student(String name) {
        this.name = name;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Nmae: " + name);
        System.out.println("Age:" + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul");
        Student s3 = new Student("Rahul", 20);
        s1.display();
        // s2.display();
        s3.display();
    }
}