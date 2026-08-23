class MissingNumber {
    static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i=0; i<=arr.length-1; i++){
            actualSum = actualSum + arr[i];
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] missingArray = {1, 2, 3, 4, 6, 7};
        System.out.println("Missing number: " + findMissingNumber(missingArray, 7));
    }
}

/*
!Logic: For numbers 1 to N:
!         expectedSum = n * (n + 1) / 2; 
!       Then:
!           missing(return this:) = expectedSum - actualSum;
 */