class SmallestElement {
    static int findSmallest(int[] arr) {
        int smallest = arr[0];
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i]< smallest)
                smallest = arr[i];
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {12, 26, 10, 35, 42};
        System.out.println("Smallest element: " + findSmallest(arr));
    }
}

/*
!Logic :-if(arr[i] < smallest)
!          smallest = arr[i];
!    We assume the first element is largest and compare it with every other element.
 */
