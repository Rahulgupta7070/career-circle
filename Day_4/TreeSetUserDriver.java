package Day_4;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetUserDriver {
    public static void main(String[] args) {

		TreeSet<UserTreeSet> users = new TreeSet<>(

				Comparator.comparing(UserTreeSet::getAge));

		users.add(new UserTreeSet(101, "Pooja Rani", 26));
		users.add(new UserTreeSet(102, "Geeta Rani", 22));
		users.add(new UserTreeSet(103, "Nadeem", 20));
		users.add(new UserTreeSet(105, "Neha Rani", 24));
		users.add(new UserTreeSet(106, "Mohit", 28));

		// printing using for-each loop

		for (UserTreeSet user : users) {
			System.out.println(user);
		}
	}
    
}
