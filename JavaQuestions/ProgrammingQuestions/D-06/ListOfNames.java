import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;
    double salary;

    Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class ListOfNames {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
            new Person("Rahul", 22, 50000), 
            new Person("Amit", 25, 60000), 
            new Person("Mahesh", 23, 45000));

        List<Integer> ages = list.stream()
                                    .map(n -> n.age)
                                    .collect(Collectors.toList());
        System.out.println("List of Age: " + ages);
                                    
        List<String> names = list.stream()
                                    .map(m -> m.name)
                                    .collect(Collectors.toList());                            
        System.out.println("List of Names: " + names);
    }
}
