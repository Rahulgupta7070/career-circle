
class MoveZeros {
    static void MoveZerosAtEnd(int[] arr) {
        int index = 0;
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i]!=0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while(index<arr.length) {
            arr[index] = 0;
            index++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        MoveZerosAtEnd(arr);
        for(int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
