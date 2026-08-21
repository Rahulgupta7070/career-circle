package Day5.MethodOverriding;

public class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer is Coding");
    }
}