package Day_05.MethodChaining;

public class Student {
    private String name;
    private int age;

    Student setName(String name) {
        this.name = name;
        return this;
    }

    Student setAge(int age) {
        this.age = age;
        return this;
    }

    Student display() {
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        return this;
    }
}
