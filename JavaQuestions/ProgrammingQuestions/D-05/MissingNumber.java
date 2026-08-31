class MissingNumber {
    static int findMissingNumber(int[] arr) {
        int n = arr.length+1;
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i=0; i<=arr.length-1; i++) {
            sum = sum+arr[i];
        }
        return totalSum-sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 4, 5};
        int res = findMissingNumber(arr);
        System.out.println("Missing Number : " + res);
    }
}
