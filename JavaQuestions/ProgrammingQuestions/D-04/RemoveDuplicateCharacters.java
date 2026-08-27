class RemoveDuplicateCharacters {
    static void removeDuplicates(String str) {
        for(int i=0; i<=str.length()-1; i++) {
            boolean duplicate = false;
            for(int j=0; j<=i-1; j++) {
                if(str.charAt(i) == str.charAt(i)) {
                    duplicate = true;
                    break;
                }
            }
            if(duplicate == false) {
                System.out.println("Remove Duplicates element: " + str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        String str = "communication";
        removeDuplicates(str);
    }
}
