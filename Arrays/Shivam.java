package Arrays;

public class Shivam {
    String name = "Shivam";

    public void display() {
        String name = "Neel";

        System.out.println("Local: " + name);
    }

    public static void main(String[] args) {
        Shivam s = new Shivam();
        s.display();
    }
}
