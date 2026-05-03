package Topics._24_HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class _3_TwoSum {
    private static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) return new int[]{map.get(diff), i};
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 6, 1, 9};
        String res = Arrays.toString(_3_TwoSum.twoSum(arr, 9));
        System.out.println("Answer : " + res);
    }
}
