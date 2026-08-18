import java.util.Arrays;

public class revArray1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rev = new int[arr.length];
        
        for(int i=arr.length-1; i>=0; i--) {
            rev[i]=arr[arr.length-1-i];
        }
        System.out.print("[");
        for(int i=0; i<=rev.length-1; i++) {
            System.out.print(rev[i]+ " ");

            if (i != rev.length - 1) {
            System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println("Reversed Array: " + Arrays.toString(rev));
    }
}