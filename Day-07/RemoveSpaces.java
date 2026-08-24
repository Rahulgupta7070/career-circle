//! 7. Remove all spaces from a String

class RemoveSpaces {
    static String removeSpaces(String str) {
        String result = "";
        for(int i=0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch != ' ') {
                result = result + ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "Java Full Stack Developer  ";
        System.out.println("Remove Spaces: " + removeSpaces(str));
    }
}
/*
! Logic:- Add only non-space characters
 */