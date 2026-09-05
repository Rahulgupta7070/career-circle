package ComparableAndComparator;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;


public class StudentDriver {
   public static void main(String[] args) {
//	   ArrayList<Student> s1 = new ArrayList<>();   
	   LinkedList<Student> s1 = new LinkedList<>();   
	   s1.add(new Student("Ankit",105));
	   s1.add(new Student("Rohan",102));
	   s1.add(new Student("Amit",101));
	   s1.add(new Student("Sohan",107));
	   s1.add(new Student("Mohan",106));

	   Collections.sort(s1);
	   
	   for(Student s:s1) {
		   System.out.println(s);
	   }
	  
    }
}
