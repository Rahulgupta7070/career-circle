package Day_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConvertString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java","spring","boot");
        List<String> rslt = names.stream()
                                 .map(x -> x.toUpperCase())
                                 .collect(Collectors.toList());

                                 System.out.println(rslt);

            }
}
