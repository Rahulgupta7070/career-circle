package day06.Polymorphism;

public class Driver {
    public static void main(String[] args) {

        
        Animal animal = new Dog();
        animal.sound();

        
        animal = new Cat();
        animal.sound();
    }
}
