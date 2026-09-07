import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {
    public static void main(String[] args) {
        // List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);

        // Stream API

        int sum = list.stream()
                    .mapToInt(mohd -> mohd)
                        .sum();
        System.out.println("Sum: " +sum);   
        
        // List<Integer> l1 = new ArrayList<>();
        // int[] a = {1, 2, 3, 4, 5};
        // int sum = l1.stream().mapToInt(x->x).sum();
        // System.out.println(sum);
    }
}
// !mapToInt() method:- convert from Integer -> int
