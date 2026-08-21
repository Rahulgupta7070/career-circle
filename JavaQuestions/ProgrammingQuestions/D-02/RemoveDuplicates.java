// ! Remove Duplicates from Sorted Array

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 10, 22, 22, 32, 40, 40};
        int index = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i=0; i<=index-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}