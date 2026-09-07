import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUppercase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "spring", "boot");
        // Stream API
        List<String> upper = list.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("UPPERCASE: " + upper);
    }
}
// ! The return type of collect() method is: List<String>
// ! here list.stream() method is the copy of collections
// ! here Collectors is acts as like Utility class
// ! here toList() method is used for List<String>