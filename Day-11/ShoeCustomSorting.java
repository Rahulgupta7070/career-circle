import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShoeCustomSorting {
    int id;
    String brand;
    double price;

    ShoeCustomSorting(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "  " + brand + "  " + price;
    }

    public static void main(String[] args) {
        ArrayList<ShoeCustomSorting> shoes = new ArrayList<>();
        shoes.add(new ShoeCustomSorting(103, "Nike", 5000));
        shoes.add(new ShoeCustomSorting(101, "Adidas", 3500));
        shoes.add(new ShoeCustomSorting(105, "Reebok", 4000));
        shoes.add(new ShoeCustomSorting(104, "Puma", 4500));
        shoes.add(new ShoeCustomSorting(102, "Campus", 3000));
        Comparator<ShoeCustomSorting> idComparator = new Comparator<ShoeCustomSorting>() {

            @Override
            public int compare(ShoeCustomSorting s1, ShoeCustomSorting s2) {
                return Integer.compare(s1.id, s2.id);
            }
        };
        Collections.sort(shoes, idComparator);
        System.out.println("Custom Sorting is ascending order based on Id");
        for (ShoeCustomSorting s : shoes) {
            System.out.println(s);
        }
    }
}
