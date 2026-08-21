// ! Check Whether a Number is Prime

class PrimeNumber {
    public static void main(String[] args) {
        int n = 37;
        if(isPrime(n))
            System.out.println("Prime number");
        else 
            System.out.println("Not a prime number");
    }
    public static boolean isPrime(int n) {
        if(n<2)
            return false;
        for (int i=2; i*i<=n; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
