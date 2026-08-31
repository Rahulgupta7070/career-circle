import java.util.TreeSet;

class Student{
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
class StudentTreeSet {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(
            (s1, s2) -> s2.name.compareTo(s1.name)
        );
        students.add(new Student(111, "Amit"));
        students.add(new Student(112, "Manish"));
        students.add(new Student(113, "Praveen"));
        students.add(new Student(114, "Ayush"));
        students.add(new Student(115, "Ritik"));
        students.add(new Student(116, "Mahesh"));

        System.out.println("Students in descending order by Name: ");
        for(Student s : students) {
            System.out.println(s);
        }
    }
}
