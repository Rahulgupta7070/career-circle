public class arraySumAndAvg {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int sum=0;
        int avg=0;

        for(int i=0; i<=arr.length-1; i++) {
            sum=sum+arr[i];
        }

        for(int i=0; i<=arr.length-1; i++) {
            avg=sum/arr.length;
        }

        System.out.println(sum);
        System.out.println(avg);
    }
}
