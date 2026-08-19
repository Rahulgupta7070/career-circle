package day2;

public class LargestElement {
    
    public static void main(String[] args) {
        
        int ar [] ={10 ,25 ,5 ,40 ,15};
        int max=Integer.MIN_VALUE;

        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println("Largest element in the array is: " + max);

    }
}
