package day_10.StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StringToUppercase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "spring", "boot");
        List<String> newStrings = strings.stream()
                                         .map(String::toUpperCase)
                                         .collect(Collectors.toList());
        System.out.println(newStrings);
    }
}