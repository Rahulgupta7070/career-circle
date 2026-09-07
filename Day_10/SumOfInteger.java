package Day_10;

import java.util.Arrays;
import java.util.List;

public class SumOfInteger {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        int sum = num.stream()
                     .mapToInt(x -> x)
                     .sum();
                     System.out.println(sum);
        
    }
}
