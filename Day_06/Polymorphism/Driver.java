package Day_06.Polymorphism;

public class Driver {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
