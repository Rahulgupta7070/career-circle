package MethodOverriding;

public class EmployeeMethoOverrideDriver {
   public static void main(String[] args) {
	   EmployeeMethoOverride v = new EmployeeMethoOverride();
	   v.work();
	   EmployeeMethoOverride d = new Developer();
	   d.work();
    }
}
