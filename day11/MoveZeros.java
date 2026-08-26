public class MoveZeros {
    public static void main(String[] args) {
        Move0();

    }

    public static void Move0(){
         int []arr={0,1,0,3,12};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                arr[count++] = arr[i];
                
            }
            
        }


        while (count<arr.length) {
            arr[count++]=0;
            
        }
        System.out.println("Array after moving zeros:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        
    }
    
}
}
