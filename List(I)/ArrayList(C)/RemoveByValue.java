import java.util.ArrayList;

public class RemoveByValue {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);

        // i want to remove 30 by value
        num.remove(Integer.valueOf(30));
        System.out.println(num);

    }
}
