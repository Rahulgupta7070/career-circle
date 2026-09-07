import java.util.Arrays;
import java.util.List;

public class CountStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");
        long count = list.stream()
                .filter(jayant -> jayant.startsWith("A"))
                .count();
        System.out.println("Count is: " + count);
    }
}
