class Person {

    String name;
    int age;

    Person() {
        this("Unknown");
        System.out.println("Default Constructor");
    }

    Person(String name) {
        this(name, 0);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class driver02 {

    public static void main(String[] args) {

        Person p = new Person();
    }
}
