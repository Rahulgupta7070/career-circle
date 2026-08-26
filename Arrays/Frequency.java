package Arrays;

public class Frequency {
    public static void findNumber(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println(arr[i] + "---->> " + count);
        }

    }

    public static void main(String[] args) {

        int arr[] = { 2, 1, 5, 4, 4, 4, 2, 1, 1, 1 };
        findNumber(arr);
    }
}