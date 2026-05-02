package Logic_Building.Arrays;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicate(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 3, 3, 4, 5, 6};
        int end = removeDuplicate(arr);
        for (int i = 0; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
