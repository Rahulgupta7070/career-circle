class p1 {



    public static boolean isPrime(int n) 
    
    {
        if (n < 2) {
            return false;
        } else if (n == 2 || n == 3) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) 
    
    {
        int n = 5;

        boolean result = isPrime(n);

        System.out.println("Is " + n + " prime " + result);
    }
}