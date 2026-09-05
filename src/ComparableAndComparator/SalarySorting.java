package ComparableAndComparator;

import java.util.Comparator;

public class SalarySorting implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return o1.dept.compareTo(o2.dept);   
		return Integer.compare(o2.eid, o1.eid);
	}
     
} 
