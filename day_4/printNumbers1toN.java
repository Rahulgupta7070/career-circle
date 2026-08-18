public class printNumbers1toN {
    public static void main(String[] args) {
        printNum(5);
    }
    public static void printNum(int n) {
        for(int i=n; i>0; i--) {
            System.out.print(n--+" ");
        }
    }
}