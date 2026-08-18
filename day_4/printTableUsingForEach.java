public class printTableUsingForEach {
    public static void main(String[] args) {
        printTable(8);
    }
    public static void printTable(int n) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int num : arr) {
            int print= n*num;
            System.out.println(n +" * "+ num +" = "+ print);
        }
    }
}