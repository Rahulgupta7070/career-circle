package day_8;
public class arraySecondLargest {
    public static void main(String[] args) {
        System.out.println(secondLargest());
    }
    public static int secondLargest() {
        int arr[] = {12, 12, 12, 12, 12, 1};
        int max;
        int sMax;
        if(arr[0]>arr[1]) {
            max=arr[0];
            sMax=arr[1];
        }
        else {
            sMax=arr[0];
            max=arr[1];
        }
        for(int i=2; i<arr.length;i++) {
            if(arr[i]>max) {
                sMax=max;
                max=arr[i];
            }
            else {
                if(arr[i]>sMax&&arr[i]!=max) {
                   sMax=arr[i];
                }
            }
        }
        return sMax;
    }
}