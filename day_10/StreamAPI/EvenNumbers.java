package day_10.StreamAPI;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(10, 15, 20, 25, 30);
        List<Integer> even = l.stream()
                              .filter(x -> x % 2 == 0)
                              .collect(Collectors.toList());
        System.out.println(even);
    }
}