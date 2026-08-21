// ! Find Largest and Smallest Element in an Array

class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 45, 18, 16};
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=1; i<=arr.length-1; i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }
            if(arr[i]<smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}
/*
! Logic: Assume first element as both largest and smallest, then compare every element
*/