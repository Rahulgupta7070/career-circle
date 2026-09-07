import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> unique = list.stream()
                                    .distinct()
                                        .collect(Collectors.toSet());
                                        
        System.out.println("Removing Duplicates element: " + unique);
    }
}
