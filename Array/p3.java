public class p3 {

    public static void nthPrime(int n) {

        int count = 0;

        for (int num = 2;; num++) {

            boolean prime = true;

            if (num < 2) {
                prime = false;
            } else if (num == 2 || num == 3) {
                prime = true;
            } else if (num % 2 == 0) {
                prime = false;
            } else {
                for (int i = 3; i * i <= num; i += 2) {

                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime) {
                count++;

                if (count == n) {
                    System.out.println(n + "th prime number = " + num);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int n = 5;

        nthPrime(n);
    }
}
