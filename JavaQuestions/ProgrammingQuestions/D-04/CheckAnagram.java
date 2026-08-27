class CheckAnagram {
    static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        int[] freq = new int[256];
        for(int i=0; i<=str1.length()-1; i++) {
            char ch = str1.charAt(i);
            freq[ch]++;
        }
        for(int i=0; i<=str2.length()-1; i++) {
            char ch = str2.charAt(i);
            freq[ch]--;
        }
        for(int i=0; i<=freq.length-1; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean res = isAnagram(str1, str2);
        System.out.println("Anagram: " + res);
    }
}
