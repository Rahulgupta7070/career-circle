import java.util.Arrays;
// import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscendDescend {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);

        List<Integer> ascending = list.stream()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> descending = list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("Ascending order= " + ascending);

        System.out.println("Descending order= " + descending);
    }
}
