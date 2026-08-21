// ! Find Missing Number from 1 to N

class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5};
        int n = 5;
        int sum = n*(n+1)/2;
        int arraySum = 0;
        for(int a : arr) {
            arraySum += a;
        }
        System.out.print("Missing number = " + (sum-arraySum));
    }
}