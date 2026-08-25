package Day_8;

public class Anagram {

    public static void main(String[] args) {

        String str1="listen";
        String str2="silent";

        boolean Result=checkAnagram(str1,str2);
        System.out.println("The Final Result is: "+Result);
        
    }

    public static boolean checkAnagram(String str1, String str2){

        if(str1.length() !=str2.length()){
            return false;
        }

        int[] freq=new int[26];

        for(int i=0; i<str1.length(); i++){
            freq[str1.charAt(i)-'a']++;
        }

        for(int i=0; i<str2.length(); i++){
            freq[str2.charAt(i)-'a']--;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i]!=0){
               return false;
            }
    
        }
        return true;
    }
    
}
