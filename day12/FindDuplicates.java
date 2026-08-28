import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i])) {
                duplicate.add(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }

        System.out.println(duplicate);
    }
}