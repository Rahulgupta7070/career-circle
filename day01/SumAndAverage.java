package day01;

public class SumAndAverage {

    public static void main(String[] args) {

        int A[] = {5,10,15,20,25};
        int sum = 0;

        for(int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }

        double average = (double) sum / A.length;

        System.out.println("Sum = "+ sum);
        System.out.println("Average = "+ average);
    }
}