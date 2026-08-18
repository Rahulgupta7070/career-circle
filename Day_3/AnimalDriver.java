package Day_3;

import java.util.Scanner;

public class AnimalDriver {
    
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Animal animal2 = new Animal();
		animal2.sound();

		System.out.println("1. Dog..");
		System.out.println("2. Cat");

		System.out.println("Enter your choise..");

		int choise = sc.nextInt();

		Animal animal;

		if (choise == 1) {
			animal = new Dog();

		} else if (choise == 2) {
			animal = new Cat();
		} else {
			System.err.println("Invalid choise...");


			return;
		}

		animal.sound();
       
	}

}
