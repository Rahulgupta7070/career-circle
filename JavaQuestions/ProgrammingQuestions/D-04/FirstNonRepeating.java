class FirstNonRepeating {
    static void findFirstNonRepeating(String str) {
        for(int i=0; i<=str.length()-1; i++) {
            int count = 0;
            for(int j=0; j<=str.length()-1; j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count==1) {
                System.out.println("First Non-Repeating Character = " + str.charAt(i));
            return;
            }
        }
        System.out.println("no non-repeating character");
    }
    public static void main(String[] args) {
        String str = "aabbccdde";
        findFirstNonRepeating(str);
    }
    
}
