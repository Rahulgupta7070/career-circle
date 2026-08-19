class SumAndAvg {
    public static void main(String[] args) {
        int [] arr = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int i=0; i<=arr.length-1; i++) {
            sum = sum + arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + avg);
    }
}