public class arraySecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr) {
        int max=Integer.MIN_VALUE;     //arr[0];
        int smax=Integer.MIN_VALUE;    //arr[1];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max) {
                smax=arr[i];
            }
        }
        return smax;
    }
}