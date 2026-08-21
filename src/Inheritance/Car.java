package Inheritance;

public class Car extends Vehicle {
	String CarName;
	
	Car(){
	super();
	
	}
	Car(String CarName,String company,int hp){
		this.CarName=CarName;
		super.company=company;
		super.hp=hp;
	}
	
	public void drive() {
		System.out.println("Drive the Car");
	}
	
	public String getDetails() {
		return super.getDetails()+"\nCarName is "+ CarName;
	}

}
