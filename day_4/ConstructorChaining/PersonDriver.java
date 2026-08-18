package ConstructorChaining;

public class PersonDriver {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Imran");
        Person p3 = new Person("Imran", 26);

        p3.printDetails();
    }
}
