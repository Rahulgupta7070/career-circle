import java.util.ArrayList;

public class RemoveByIndex {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);

        // Remove the element at index at 2
        num.remove(2);
        System.out.println(num);
    }
}
