package Arrays;

public class FindLargest {
    public static int findLargest(int numbers[]) {
        int smallest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest < numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        System.out.println("largest: " + findLargest(numbers));
    }
}