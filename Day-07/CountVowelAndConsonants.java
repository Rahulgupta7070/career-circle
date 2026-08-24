//! 3. Count vowels and consonants

class CountVowelAndConsonants {
    static void countVowelAndConsonants (String str) {
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for(int i=0; i<=str.length()-1; i++) {
            char ch = str.charAt(i);
            if(ch>='a' && ch <= 'z') {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
    public static void main(String[] args) {
        String str = "Java is Platfom-independent Programming language";
        System.out.println("Vowels and Consonants: ");
        countVowelAndConsonants(str);
    }
}

/*
!Logic:- Check each character (firstly take character from a to z and for vowels check char ='a' || 'e' || 'i' || 'o' || 'u')
 */