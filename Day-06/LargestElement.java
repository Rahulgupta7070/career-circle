class LargestElement {
    static int findLargest(int[] arr) {
        int largest = arr[0];
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr [] = {22, 44, 25, 64, 45};        
        System.out.println("Largest element: " + findLargest(arr));
    }
}

/* 
! Logic:-  if (arr[i] > largest)
!              largest = arr[i];
! We assume the first element is largest and compare it with every other element.
*/
