package day2;

/**
 * SmallestElement
 */
public class SmallestElement {

    public static void main(String[] args) {
        int ar [] ={10 ,25 ,5 ,40 ,15};
        int min=Integer.MAX_VALUE;

        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        System.out.println("Smallest element in the array is: " + min);
    }
}