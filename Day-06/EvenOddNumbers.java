class EvenOddNumbers {
    static void countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i]%2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
    public static void main(String[] args) {
        int [] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        System.out.println("Even and Odd count is as: ");
        countEvenOdd(arr);
    }
}
/*
!Logic:- The key condition is:
!           arr[i] % 2 == 0
!        If remainder is 0, it is even; otherwise it is odd.
*/