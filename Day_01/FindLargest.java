package Day_01;

public class FindLargest {
    // shivamkumar
    public static void main(String[] args) {
        int arr[] = { 22, 44, 1, 78, 4 };
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}