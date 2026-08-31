class RemoveSpaces {
    static String removeSpaces(String str) {
        String res = "";
        for(int i=0; i<=str.length()-1; i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                res = res+ch;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "Java Full Stack Developer";
        String res = removeSpaces(str);
        System.out.println(res);
    }
}
