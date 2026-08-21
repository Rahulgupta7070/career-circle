package Day_01;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 33 };
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
