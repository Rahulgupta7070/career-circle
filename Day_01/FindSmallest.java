package Day_01;

public class FindSmallest {
    public static void main(String[] args) {
        int num[] = { 22, 23, 6, 33, 4, 7, 1 };
        int smallest = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];

            }
        }
        System.out.println(smallest);
    }
}
