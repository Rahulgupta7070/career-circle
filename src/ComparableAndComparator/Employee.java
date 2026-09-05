package ComparableAndComparator;

public class Employee {
    String name;
    int eid;
    double salary;
    String dept;
	public Employee(int eid,String name, double salary, String dept) {
		super();
		this.name = name;
		this.eid = eid;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	
}
