// ! Move All Zeros to End

class MoveZeros {
    public static void main(String[] args) {
        int [] arr = {0, 1, 0, 4, 7};
        int index = 0;
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index<arr.length) {
            arr[index] = 0;
            index++;
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}