package Day_4;

public class TreeSetEmployee {
    private int id;
	private String name;
	private double salary;

	public TreeSetEmployee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	@Override

	public String toString() {

		return "Employee[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
