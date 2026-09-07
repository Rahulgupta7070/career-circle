package day_10.StreamAPI;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        List<Integer> ascending = numbers.stream()
                                         .sorted((a,b)->a.compareTo(b))
                                         .collect(Collectors.toList());
                                         //collect(Collectors.toList()) converts the Stream back into a List<Integer>
                                         //.sorted(Comparator.reverseOrder())
        
        List<Integer> decending = numbers.stream()
                                         .sorted((a,b)->b.compareTo(a))
                                         .collect(Collectors.toList());
        System.out.println(ascending);
        System.out.println(decending);
    }
}