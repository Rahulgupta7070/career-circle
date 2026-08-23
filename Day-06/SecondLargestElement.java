class SecondLargestElement {
    static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int [] arr = {63, 16, 58, 23, 28};
        System.out.println("Second largest element is: " + findSecondLargest(arr));
    }
}
/*
!Logic:- The important idea is to maintain two variables:
!              *largest and *secondLargest
!        Whenever we find a new largest:
!               secondLargest = largest;
!               largest = arr[i];
*/
