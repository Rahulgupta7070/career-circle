import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {
        ArrayList<Student1> l = new ArrayList<>();
        l.add(new Student1(103, "Rahul"));
        l.add(new Student1(101, "Aman"));
        l.add(new Student1(102, "Vikas"));

        Comparator<Student1> idComparator = new Comparator<Student1>() {
            @Override
            public int compare(Student1 s1, Student1 s2) {
                return Integer.compare(s1.id, s2.id);
            }
        };
        Collections.sort(l, idComparator);
        System.out.println("ID-wise Sorting:-");
        for(Student1 s : l) {
            System.out.println(s);
        }
    }
}
