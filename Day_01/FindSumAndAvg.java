package Day_01;

public class FindSumAndAvg {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 39 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Sum is: " + sum);
        System.out.println("Average: " + avg);
    }
}
