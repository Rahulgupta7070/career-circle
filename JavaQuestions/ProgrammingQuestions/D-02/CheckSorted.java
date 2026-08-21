// ! Check Whether Array is Sorted
class CheckSorted {
    public static void main(String[] args) {
        int [] arr = {10, 12, 18, 25, 35};
        boolean sorted = true;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                sorted = false;
                break;
            }
        }
        if(sorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
}

// !LOGIC: Compare :-
/*
arr[0] with arr[1]
arr[1] with arr[2]
arr[2] with arr[3]
...
If any previous element is greater than the next element, it is not sorted
*/