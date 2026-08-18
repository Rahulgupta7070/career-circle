class Person {
    String name;
    int age;

    Person() {
        this("Unknown");
    }
    Person(String name) {
        this(name, 0);
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
        Person p = new Person("Rahul", 25);
        p.display();
    }
}