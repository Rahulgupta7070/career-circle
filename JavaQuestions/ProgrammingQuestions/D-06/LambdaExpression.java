import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++");

        // list.stream().forEachOrdered(System.out::println);
        // list.forEach(s -> System.out.println(s));

        list.forEach(System.out::println); // Using method reference

    }
}
