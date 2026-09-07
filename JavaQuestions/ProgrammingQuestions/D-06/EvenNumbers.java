import java.util.Arrays;
import java.util.List;
// import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
        long even = list.stream()
                                .filter(n->n%2==0)
                                        .count();
                                        // .collect(Collectors.toList());
        System.out.println("Count the Even Number: " +even);
    }
}
