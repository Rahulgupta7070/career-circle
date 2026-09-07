package day_10.StreamAPI;
import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int sum = nums.stream()
                      .mapToInt(Integer::intValue)
                      .sum();
        System.out.println("Sum of numbers is: "+sum);
    }
}