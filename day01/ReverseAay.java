package day01;

public class ReverseAay {
    public static void main(String[] args) {
        
        int[] A = {1,2,3,4,5};

        int start = 0;
        int end = A.length - 1;

        while(start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed Aay: ");

        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}