class ContinuePattern {
    public static void main(String[] args) {
        int n = 1;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++)
                System.out.printf("%-4d", n++);
            System.out.println();
            
        }
    }
}