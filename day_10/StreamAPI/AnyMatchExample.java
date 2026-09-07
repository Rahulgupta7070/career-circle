package day_10.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 35, 52, 14);
        boolean result = nums.stream()
                             .anyMatch(x->x>50);
        System.out.println(result);
    }
}