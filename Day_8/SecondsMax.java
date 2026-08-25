package Day_8;

public class SecondsMax {

    public static void main(String[] args) {
        
        int[] num={10,20,30,25,36,45,69,78,96,85};
        secondsLargestNum(num);
    }

    public static void secondsLargestNum(int[] num){

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int nums:num){
            if(nums>max){
                secondMax=max;
                max=nums;
            }else if(nums> secondMax && nums !=max){
                secondMax=nums;
            }
        }

        System.out.println("The Seconds Max Number is: "+secondMax);
    }
    
}
