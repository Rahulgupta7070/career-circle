class SecondLargest{
    public static void main(String []args){

        int [] arr ={1,2,35,1,10,34,1};

        int largest;
        int secondLargest;

        if(arr[0]>arr[1]){
            largest=arr[0];
            secondLargest=arr[1];
            
        }else{
            largest=arr[1];
            secondLargest=arr[0];

        }

        for (int i = 2; i <= arr.length - 1; i++){
            if(arr[i]>largest){

                secondLargest=largest;
                largest=arr[i];

            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("SecondLargestnumber is:  "+secondLargest);
    }
}