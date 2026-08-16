class SumAverage {

    public static void findSumAverage(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }


    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25};

        findSumAverage(arr);
    }
}