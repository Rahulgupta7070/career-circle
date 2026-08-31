import java.util.TreeSet;

class User {
    int id;
    String name;
    int age;

    User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }
}
public class UserTreeSet {
    public static void main(String[] args) {
        TreeSet<User> users = new TreeSet<>((u1, u2) -> u1.age - u2.age);
        users.add(new User(101, "Manish", 27));
        users.add(new User(102, "Karan", 25));
        users.add(new User(103, "Arjun", 22));
        users.add(new User(104, "Ramesh", 23));
        users.add(new User(105, "Jitesh", 26));

        for(User u : users) {
            System.out.println(u);
        }

    }
}
