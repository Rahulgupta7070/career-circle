package day10;

import java.util.HashMap;
import java.util.Map;

public class FreqOfEachElementUsingHashMap {
    public static void main(String[] args) {

        int []arr={1,2,2,3,1,1};

        HashMap<Integer,Integer> Hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (Hm.containsKey(arr[i])) {
                Hm.put(arr[i],Hm.get(arr[i])+1);
                
            }
            else{
                Hm.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:Hm.entrySet()){
            System.out.println("Element|Frequency ");
            System.out.println(entry.getKey()+"          "+entry.getValue());
        }
        
    }
    
}
