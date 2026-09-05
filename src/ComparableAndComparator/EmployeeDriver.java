package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeDriver {
   public static void main(String[] args) {
//	   ArrayList<Employee> e1 = new ArrayList<>();   
//	   ArrayList<Employee> e1 = new ArrayList<>();   
	   TreeSet<Employee> e1 = new TreeSet<>(new SalarySorting());   
	   
	  // LinkedList<Student> s1 = new LinkedList<>();   
	   e1.add(new Employee(105,"Ankit",10000.0,"CS"));
	   e1.add(new Employee(108,"Mohan",20000.0,"Ele"));
	   e1.add(new Employee(102,"Rohan",9000.0,"civil"));
	   e1.add(new Employee(107,"Amit",50000.0,"CS"));
	   e1.add(new Employee(103,"Sani",80000.0,"IT"));
	   
	  // Collections.sort(e1,new SalarySorting());
	   
	   for(Employee e:e1) {
		   System.out.println(e); 
	   }
	   
	   
   }
}
