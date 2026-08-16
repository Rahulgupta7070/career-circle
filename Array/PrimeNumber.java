import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int num = 2; list.size() < 100; num++) {

            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                list.add(num);
            }
        }

        System.out.println(list);
    }
}