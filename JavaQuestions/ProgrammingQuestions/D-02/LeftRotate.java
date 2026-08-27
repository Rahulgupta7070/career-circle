// !Left Rotate Array by K Positions

class LeftRotate {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        int k = 2;
        k=k%arr.length;
        for(int j=0; j<k; j++) {
            int first = arr[0];
            for(int i=0; i<arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = first;
        }
        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}