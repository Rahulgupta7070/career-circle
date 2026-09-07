import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 2, 9, 1, 7);
        int min = list.stream()
                // .min(Integer::compare)
                .min((a, b) -> a.compareTo(b))
                .get();
        System.out.println("Min = " + min);

        int max = list.stream()
                .max(Integer::compare)
                .get();
        System.out.println("Max = " + max);
    }
}
// ! (forEach(System.out::println)) ---> Method Reference