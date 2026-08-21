import java.util.ArrayList;

public class AccessElement {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Agra");
        city.add("Mathura");
        city.add("Jaipur");
        city.add("Bhartpur");
        city.add("Mumbai");

        System.out.println(city.getFirst());
        System.out.println(city.get(1));
        System.out.println(city.get(2));
        System.out.println(city.get(3));
        System.out.println(city.getLast());

    }
}
