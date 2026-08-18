package Day_2;

public class Student2 {
    private String name;
	private int age;

	Student2 setName(String name) {

		this.name = name;
		return this;
	}

	Student2 setAge(int age) {
		this.age = age;
		return this;
	}

	public void display() {
		System.out.println("Student Name is: " + name);
		System.out.println("Student Age is: " + age);
	}

}
