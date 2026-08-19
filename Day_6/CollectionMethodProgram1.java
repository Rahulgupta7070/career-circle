package Day_6;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethodProgram1 {
    

    public static void main(String[] args) {

		Collection<String> names = new ArrayList<>();

		names.add("Pooja Rani");
		names.add("Geeta Rani");
		names.add("Nadeem");
		names.add("Amit Shah");
		names.add("Khan Bhai");
		names.add("Rahul Gandhi");
		names.add("Dimple Bhabhi");

		System.out.println("Collection: " + names);

		System.out.println();
		System.out.println("Removed..");
		System.out.println();
		names.remove("Nadeem");

		System.out.println("After Removed.." + names);

		System.out.println();
		System.out.println("Contains Amit Shah: " + names.contains("Amit Shah"));

		System.out.println();
		System.out.println("Size: " + names.size());

		System.out.println();
		System.out.println("Is Empty: " + names.isEmpty());

	}
}
