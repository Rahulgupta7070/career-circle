package Day_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,15,2);

        List<Integer> even = numbers.stream()
                                    .filter(x-> x%2 == 0)
                                    .collect(Collectors.toList());

                                    System.out.println(even);
    }
    
}
