package Abstraction;

public class Rectangle extends Shape {
     int length;
     int size;
     int breadth;
     Rectangle(){
    	 
     }
	 public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	 }
	 public String area() {
		 return "Rectangle Area is "+length*breadth;
	 }
	 public String getSquare() {
		 return "Rectangle Square is "+size*size;
	 }
     
}
