public class sumOfNNaturalUsingWhile {
    public static void main(String[] args) {
        sumNNatural(5);
    }
    public static void sumNNatural(int n) {
        int sum =0;
        int i = 1;
        while(i<=n) {
            sum=sum+i;
            i++;
        }
        System.out.print("Sum = " +sum);
    }
}