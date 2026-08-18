package MethodOverloading;

public class MethodOverloading {
	
	public static void main(String[] args) {
		System.out.println(add(10,40));
		System.out.println(add(34.22,432.13));
		System.out.println(add(10,50,80));
	}
	
	
  public static int add(int a,int b) {
	  return a+b;
  }
  public static double add(double a,double b) {
	  return a+b;
  }
  public static int add(int a,int b,int c) {
	  return a+b+c;
  }
  
}
