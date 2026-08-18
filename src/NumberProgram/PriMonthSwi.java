package NumberProgram;

import java.util.Scanner;

public class PriMonthSwi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Month");
		int month =sc.nextInt();
	
		switch (month) {
		case 1:
			if(month==1) {
				System.out.println("Month is January");
			}break;
		case 2:
			if(month==2) {
				System.out.println("Month is February ");
			}break;
		case 3:
			if(month==3) {
				System.out.println("Month is March ");
			}break;
		case 4:
			if(month==4) {
				System.out.println("Month is April");
			}break;
		case 5:
			if(month==5) {
				System.out.println("Month is May");
			}break;
		case 6:
			if(month==6) {
				System.out.println("Month is Jun ");
			}break;
		case 7:
			if(month==7) {
				System.out.println("Month is July ");
			}break;
		case 8:
			if(month==4) {
				System.out.println("Month is August");
			}break;
		case 9:
			if(month==9) {
				System.out.println("Month is September");
			}break;
		case 10:
			if(month==10) {
				System.out.println("Month is October ");
			}break;
		case 11:
			if(month==11) {
				System.out.println("Month is November ");
			}break;
		case 12:
			if(month==12) {
				System.out.println("Month is December");
			}break;
			
		default:
			throw new IllegalArgumentException("Wrong Month Number : " + month);
		}
	}
}
