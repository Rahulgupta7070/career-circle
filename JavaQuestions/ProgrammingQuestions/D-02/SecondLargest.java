// !Find Second Largest Distinct Element

class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {12, 20, 15, 20, 13};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }
            else if  (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        if(second==Integer.MIN_VALUE) {
            System.out.println("Second largest does not exit");
        } else  {
            System.out.println("Second largest = " + second);
        }
    }
}

// ! LOGIC: The important part is arr[i] != largest, because the question asks for distinct and should be second largest.