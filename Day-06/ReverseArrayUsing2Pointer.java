class ReverseArrayUsing2Pointer {
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            int temp = arr[start];
            arr [start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        System.out.print("Reversed array: "); 
        for(int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
/*
!Logic:- 5  2  8  2  9
!        ↑           ↑
!       start       end

!      Swap them and move both pointers:
!       9  2  8  2  5
!          ↑       ↑
!        start     end

!       Continue until:
!       start < end
 */