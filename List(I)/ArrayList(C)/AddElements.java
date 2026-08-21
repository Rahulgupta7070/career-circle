import java.util.ArrayList;

public class AddElements {
    public static void main(String[] args) {
        // Create an empty ArrayList of integers.
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        System.out.println(num);
        num.add(50);
        System.out.println(num);

        num.remove(2);
        System.out.println(num);
    }
}
