package Day_4;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetEmployeeDriver {
    public static void main(String[] args) {

		TreeSet<TreeSetEmployee> employees = new TreeSet<>(

				Comparator.comparing(TreeSetEmployee::getSalary).reversed());

		employees.add(new TreeSetEmployee(101, "Pooja Rani", 69000));
		employees.add(new TreeSetEmployee(102, "Geeta Rani", 25000.25));
		employees.add(new TreeSetEmployee(103, "Neha Rani", 60000));
		employees.add(new TreeSetEmployee(104, "Gabbar", 70000));
		employees.add(new TreeSetEmployee(105, "Mohit Soni", 78000));
		employees.add(new TreeSetEmployee(106, "Rahul Rani", 85000));

		// size() -> Return number of employees

		System.out.println();
		System.out.println("Total Employees: " + employees.size());
		System.out.println();

		// contains() -> Check weather an object exists

		System.out.println();
		TreeSetEmployee employee1 = new TreeSetEmployee(101, "Pooja Rani", 69000);
		System.out.println("Contains Employee: " + employees.contains(employee1));
		System.out.println();

		// isEmpty() -> Check weather TreeSet is empty

		System.out.println("Is TreeSet Empty: " + employees.isEmpty());
		System.out.println();

		// first() -> Return first elements according to TreeSet sorting

		System.out.println("First Employee: " + employees.first());
		System.out.println();

		// last()-> Return last elements according to TreeSet sorting

		System.out.println("Last Employee: " + employees.last());
		System.out.println();

		// printing all employees using Iterator
		Iterator<TreeSetEmployee> itr = employees.iterator();

		// printing using iterator

		while (itr.hasNext()) {
			TreeSetEmployee employee = itr.next();
			System.out.println(employee);
		}

		// remove()-> Removes an employee

		// System.out.println("Remove All Employee: " + employees.remove(employee1));

		// clear() -> Remove all employee

//		System.out.println(employees.clone());
	}

}
