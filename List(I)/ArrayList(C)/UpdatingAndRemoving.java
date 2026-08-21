import java.util.ArrayList;

public class UpdatingAndRemoving {
    public static void main(String[] args) {
        ArrayList<String> course = new ArrayList<>();
        course.add("Java");
        course.add("Python");// i want to change this course
        course.add("Sql");
        course.add("Html");

        course.set(1, "Java Script");
        System.out.println(course);
    }
}
