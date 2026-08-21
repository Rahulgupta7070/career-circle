package Abstraction;

public class Circle {
	double radius;
	Circle(){
		
	}
	Circle(double radius){
		this.radius=radius;
	}
	public String area() {
		return "Circle Area is "+Math.PI*radius*radius;
	}

}
