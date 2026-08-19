import java.util.Arrays;

class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {12, 35, 1, 10, 34, 1};

        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int secondLargest = -1;

        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i]!=largest) {
                secondLargest=arr[i];
                break;
            }
        }
        if (secondLargest==-1) {
            System.out.println("Not Available");
        } else {
            System.out.println("Second largest = " + secondLargest);
        }
    }
}