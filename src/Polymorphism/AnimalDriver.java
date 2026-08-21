package Polymorphism;

public class AnimalDriver {
 public static void main(String[] args) {
	Animal a= new Dog();
	a.sound();
	Animal c = new Cat();
	c.sound();
}
}
