package Day_04.ConstructorChaining;

public class Person {
    String name;
    int age;

    Person() {
        this("Shivam", 25);
    }

    Person(String name) {
        this(name, 25);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}
