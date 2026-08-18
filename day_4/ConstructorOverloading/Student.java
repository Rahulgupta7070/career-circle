package ConstructorOverloading;

public class Student {
    String name;
    int age;
    Student() {
        System.out.println("Default Constructor");
    }
    Student(String name) {
        this.name=name;
    }
    Student(String name, int age) {
        this.name=name;
        this.age=age;
    }
    void printDetails() {
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}