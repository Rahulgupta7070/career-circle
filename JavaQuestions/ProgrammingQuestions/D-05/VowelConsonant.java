class VowelConsonant {
    static void count(String str) {
        int vowels = 0;
        int consonants = 0;
        for(int i=0; i<=str.length()-1; i++) {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                vowels++;
            } else if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
                consonants++;    
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
    public static void main(String[] args) {
        String str = "learn Programming";
        count(str);
    }
}
