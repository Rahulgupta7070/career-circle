package Assignments;

public class FindSecondLargest {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 20, 8, 15 };
        int largest = arr[0];
        int largest_2 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest_2 = largest;
                largest = arr[i];

            }
        }
        System.out.println(largest_2);
    }
}