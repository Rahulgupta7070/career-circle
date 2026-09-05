import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student st) {
        return this.name.compareTo(st.name);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " +name;
    }
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<>();
        l.add(new Student(103, "Rahul"));
        l.add(new Student(101, "Aman"));
        l.add(new Student(102, "Vikas"));

        Collections.sort(l);
        System.out.println("Name-wise Sorting: ");

        for (Student s : l) {
            System.out.println(s);
        }
    }
    
}
