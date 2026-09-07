package day_10.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class CountString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");
        long count = str.stream()
                        .filter(name -> name.startsWith("A"))
                        .count();
        System.out.println(count);
    }
}