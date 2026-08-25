package Day_8;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String str="Mohamad Kamruddeen";

        String Result=removeDuplicates(str);
        System.out.println("The Final Result is: "+Result);

    }
    public static String removeDuplicates(String str){
        String result="";
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            if(result.indexOf(ch)==-1){
                result=result+ch;
            }
        }

        return result;
    }
}
