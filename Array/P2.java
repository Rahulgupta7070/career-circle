class p2 {

    public static void isPrime() {

        int start = 1;
        int end = 100;

        int count = 0;

        for (int n = start; n <= end; n++) {

            boolean prime = true;

            if (n < 2) {
                prime = false;
            } else if (n == 2 || n == 3) {
                prime = true;
            } else if (n % 2 == 0) {
                prime = false;
            } else {
                for (int i = 3; i * i <= n; i += 2) {

                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                System.out.println(n);
                count++;
            }
        }

        System.out.println("Total prime numbers = " + count);
    }

    public static void main(String[] args) {

        isPrime();
    }
}