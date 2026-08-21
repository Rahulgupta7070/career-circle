package Day5.Polymorphism;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();

        a3.sound();
        a1.sound();
        a2.sound();
    }
}