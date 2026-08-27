// ! 1. Find Frequency of Each Element — Array
// METHOD-1: Using length of general apprach
// class FrequencyArray {
//     static void getFrequency(int[] arr) {
//         int[] freq = new int[101];
//         for(int n:arr)
//             freq[n]++;
//         for(int i=0; i<=freq.length-1; i++) {
//             if (freq[i]>0) {
//                 System.out.println(i+" is: "+freq[i]+" times");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {8, 5, 12, 8, 12, 5, 7, 12, 9};
//         getFrequency(arr);
//     }
// }

// METHOD-2: Using Map as a HashMap

import java.util.HashMap;
import java.util.Map;

class FrequencyArray {
    public static void main(String[] args) {
        int[] arr = {11, 12, 12, 13, 11, 11};
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : arr) {
            int val = m.getOrDefault(n, 0)+1;
            m.put(n, val);
        }
        System.out.println(m);
    }
} 