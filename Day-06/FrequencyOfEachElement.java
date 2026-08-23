class FrequencyOfEachElement {
    static void findFrequency(int[] arr) {
        System.out.println("Frequency of each element: ");
        for(int i=0; i<=arr.length-1; i++) {
            boolean alreadyCounted = false;

            for(int k=0; k<i; k++) {
                if(arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if(alreadyCounted) {
                continue;
            }
            int count = 0;
            for(int j=0; j<=arr.length-1; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " --> " + count);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 23, 35, 12, 35, 28};
        findFrequency(arr);
    }
}
/*
!Logic:- For every unique element, count how many times it occurs.
!           arr = {5, 2, 8, 2, 9, 1, 5, 8}
!       Otput:- 5 -> 2
!               2 -> 2
!               8 -> 2
!               9 -> 1
!               1 -> 1
 */