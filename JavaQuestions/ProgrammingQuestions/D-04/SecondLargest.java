// ! 2. Find Second Largest Distinct Element — Array

class SecondLargest {
    static void findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;
        for(int i=0; i<=arr.length-1; i++) {
            if (arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];   
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        if (secondLargest==Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exit");
        } else {
            System.out.println("Second Largest = " + secondLargest);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20};
        findSecondLargest(arr);
    }
}
