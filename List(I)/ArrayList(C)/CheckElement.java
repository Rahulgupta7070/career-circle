import java.util.ArrayList;

public class CheckElement {
    public static void main(String[] args) {
        ArrayList<String> language = new ArrayList<>();
        language.add("Java");
        language.add("Python");
        language.add("Java Script");

        System.out.println(language.contains("Java"));
        if (language.contains("Python")) {
            System.out.println("Yes.!! it containts python language :)");
        } else {
            System.out.println("It does not contains python language :(");
        }

    }
}
