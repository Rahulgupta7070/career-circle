class SumOfAllElements {
    static int findSumOfAllElements(int [] arr) {
        int sum = 0;
        for(int i=0; i<=arr.length-1; i++) {
            sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr [] = {1, 3, 5, 7, 9};
        System.out.println("Sum Of all elements: " + findSumOfAllElements(arr));
    }
}
/*
! Logic:- Start with:
!           int sum = 0;
!         Then:
!           sum = sum + arr[i];
 */
