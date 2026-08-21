package Inheritance;

public class VehicleCarDriver {
   public static void main(String[] args) {
	    Car c = new Car("Nexon","TATA",250);
	    c.start();
	    c.drive();
	    System.out.println(c.getDetails());
	    
   }
}
