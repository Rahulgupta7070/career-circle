package Day_10;

import java.util.Arrays;
import java.util.List;

public class CountString {
    //Count Strings Starting with 'A
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple","Banana","Cherry","Avocado");
        long count = names.stream()
                          .filter(x -> x.startsWith("A"))
                          .count();

                          System.out.println(count);
        
    }
}
