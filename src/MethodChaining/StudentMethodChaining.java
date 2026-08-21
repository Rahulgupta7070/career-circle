package MethodChaining;

public class StudentMethodChaining {
	String name;
	int age;
	
	StudentMethodChaining(){
		
	}
	StudentMethodChaining(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String setName() {
		return name;
	}
	public String setAge() {
		return " "+age;
	}
	public void display() {
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		
	}
	

}
