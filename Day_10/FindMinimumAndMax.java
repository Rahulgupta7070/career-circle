package Day_10;

import java.util.Arrays;
import java.util.List;

public class FindMinimumAndMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4,2,9,1,7);

        int min = numbers.stream()
                         .min(Integer::compare)
                         .get();



        int max = numbers.stream()
                         .max(Integer:: compare)
                         .get();
                         
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);

}
}
