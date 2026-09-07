package Arrays;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "Neel";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        System.out.println(result);

    }
}
