package Day_8;

public class FindFrequency {

    public static void main(String[] args) {

        int[] num={1,2,5,4,1,2,4,5,6,8,7};

        printFrequency(num);
        
    }

    public static void printFrequency(int[] num){

        int[] freq=new int[101];

        for(int nums:num){
            freq[nums]++;
        }

            for(int i=0; i<freq.length; i++){
                if(freq[i]>0){
                    System.out.println(i +" is " +freq[i]+  " times ");
              }
         }
     }
}
