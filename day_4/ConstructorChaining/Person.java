package ConstructorChaining;

public class Person {
    String name;
    int age;
    Person() {
    }
    Person(String name) {
        this.name=name;
    }
    Person(String name, int age) {
        this(name);
        this.age=age;
    }
    void printDetails() {
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}
