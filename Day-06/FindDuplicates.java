class FindDuplicates {
    static void findDuplicates(int[] arr) {
        System.out.print("Duplicates elements: ");
        for(int i=0; i<=arr.length-1; i++) {
            boolean alreadyPrinted = false;

            for(int k=0; k<i; k++) {
                if(arr[k] == arr[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
        for(int j=i+1; j<=arr.length-1; j++) {
            if(arr[i] == arr[j]) {
                System.out.println(arr[i] + " ");
                break;
            }
        }
    }
}
    public static void main(String[] args) {
        int [] arr = {11, 15, 16, 15, 18};
        findDuplicates(arr);
    }
}
/*
!Logic:- We compare every element with the elements after it. The alreadyPrinted check prevents output such as:
!           arr = {2, 2, 5 ,5, 8, 8}
!       Output:- {2, 5, 8}
 */