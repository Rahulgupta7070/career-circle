import java.util.Arrays;
import java.util.List;

public class MatchesCondition {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 35, 52, 14);

        boolean res = list.stream()
                                // .allMatch(n-> n>=10);
                                .anyMatch(n-> n>10);

        System.out.println("Number greater than 50: "+res);
    }
}
