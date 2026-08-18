package day_6.Polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat Meow");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Bark");
    }
}

public class Driver {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.sound();
        dog.sound();
    }
}