package RotateAnArray;

public class main {
    public static void main(String[] args) {

        Concept con = new Concept();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        con.rotate(nums, 3);

        for (int x : nums) {
            System.out.print(x + " ");
        }
    
}
}