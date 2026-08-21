package Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        new RotateArray().rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        int length=nums.length;
        k=k%length;
        reverse(nums, 0, length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, length-1);
    }
    public void reverse(int[] a, int start, int end){
        while(start<end){
            int temp =a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}