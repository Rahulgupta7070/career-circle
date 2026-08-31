import java.util.Iterator;
import java.util.TreeSet;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}
class EmployeeTreeSet {
    public static void main(String[] args) {
        TreeSet<Employee> emp = new TreeSet<>(
            (e1, e2) -> Double.compare(e2.salary, e1.salary));
        emp.add(new Employee(101, "Amit", 45000));
        emp.add(new Employee(102, "Umesh", 35000));
        emp.add(new Employee(103, "Suresh", 50000));
        emp.add(new Employee(104, "Rohit", 65000));
        emp.add(new Employee(105, "Manish", 75000));
        emp.add(new Employee(106, "Akash", 60000));

        System.out.println("Employee in descending order by Salary: ");
        Iterator<Employee> itr = emp.iterator();

        while (itr.hasNext()) {
            Employee e = itr.next();
            System.out.println(e);
        }
    }
}
