package Day_2;

public class Student {
    
	String name;
	int age;

	Student() {

		System.out.println("Default Constructor...");
	}

	Student(String name) { // one constructor
		this.name = name;
	}

	Student(String name, int age) { // two constructor
		this.name = name;
		this.age = age;
	}

	public String toString() {

		return "Name is: " + name + "\nAge is :" + age;
	}

}
