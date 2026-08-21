// ! WAP for Reverse an Array

class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {55, 15, 20, 25, 30, 45};
        int a = 0;
        int b = arr.length-1;
        while(a<b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        for (int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// ! Logic: Using two-pointer a and b check the conditions and reverse the array and move a and b in their respective direction