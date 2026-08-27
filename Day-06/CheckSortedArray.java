class CheckSortedArray {
    static boolean isSorted(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 6, 4, 5};
        if (isSorted(sortedArray)) {
            System.out.println("Array is sorted");
        } else 
            System.out.println("Array is NOT Sorted");
    }
}
/*
!Logic:- We compare adjacent elements:
!       if (arr[i] > arr[i + 1])
!       If this happens even once, the array is not sorted.
 */