package Logic_Building.Arrays.Sliding_Window;

import java.util.ArrayList;

public class First_Negative_Number {
    private static ArrayList<Integer> findFirstNegative(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int l = 0, r = k - 1, i = 0;
        while (r < arr.length) {
            if (arr[i] < 0) {
                result.add(arr[i]);
                i = ++l;
                r++;
            } else if (i == r) {
                result.add(0);
                i = ++l;
                r++;
            } else i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("First negative numbers are : " + findFirstNegative(new int[]{12, -1, -7, 8, -15, 30, 16, 28}, 3));
        System.out.println("First negative numbers are : " + findFirstNegative(new int[]{1, 2, 3, 4, 5}, 2));
        System.out.println("First negative numbers are : " + findFirstNegative(new int[]{-5, -3, -2, -1}, 2));
    }
}
