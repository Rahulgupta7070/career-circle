package Day_6;

import java.util.ArrayList;
import java.util.List;

public record CollectionProgram1() {
    

    public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);

		for (Integer result : list) {
			System.out.println(result);
		}

	}
}
