package Day_8;

public class FirstNon_Repeating {

    public static void main(String[] args) {

        String str="aabbcdde";

        char Result=firstNon_Repeating(str);
        System.out.println("The Final Result is:"+Result);
        
    }

    public static char firstNon_Repeating(String str){
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            int count=0;

            for(int j=0; j<str.length(); j++){
                if(ch == str.charAt(j)){
                    count++;
                }
            }

            if(count == 1){
                return ch;
            }
        }

        return '\0';
    }
    
}
