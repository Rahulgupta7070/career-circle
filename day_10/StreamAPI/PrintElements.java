package day_10.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class PrintElements {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++");
        languages.forEach(lists->System.out.println(lists));
    }
}