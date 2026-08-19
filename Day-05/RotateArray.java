class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        int[] result = new int[n];
        for(int i=0; i<=n-1; i++) {
            result[(i+k)%n] = arr[i];
        }
        System.out.print("Rotated array: ");
        for(int i=0; i<=n-1; i++) {
            System.out.print(result[i] + " ");
        }
    }
}