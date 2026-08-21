import java.util.ArrayList;

public class EnhancedForLoopWithArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(30);
        num.add(null);
        num.add(50);

        for (Integer number : num) {
            System.out.println(number);
        }

    }
}
