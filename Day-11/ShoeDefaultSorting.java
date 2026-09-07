import java.util.ArrayList;
import java.util.Collections;

public class ShoeDefaultSorting implements Comparable<ShoeDefaultSorting> {
    int id;
    String brand;
    double price;

    public ShoeDefaultSorting(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public int compareTo(ShoeDefaultSorting s) {
        return Double.compare(s.price, this.price);
    }

    @Override
    public String toString() {
        return id + "  " + brand + "  " + price;
    }

    public static void main(String[] args) {
        ArrayList<ShoeDefaultSorting> shoes = new ArrayList<>();
        shoes.add(new ShoeDefaultSorting(103, "Nike", 5000));
        shoes.add(new ShoeDefaultSorting(101, "Adidas", 3500));
        shoes.add(new ShoeDefaultSorting(105, "Puma", 4500));
        shoes.add(new ShoeDefaultSorting(102, "Reebok", 3000));
        shoes.add(new ShoeDefaultSorting(104, "Campus", 4000));
        Collections.sort(shoes);
        System.out.println("Default Sorting is Descending on the basis od Price:");
        for (ShoeDefaultSorting s : shoes) {
            System.out.println(s);
        }
    }
}
