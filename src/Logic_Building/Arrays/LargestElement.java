package Logic_Building.Arrays;

import java.util.*;

public class LargestElement {

    // TC = O(n), SC = O(1)
    private static int calculateLargest(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > arr[res]) res = i;
        return res;
    }

    public static void main(String[] args) {
        // int []arr = new int[5];

        int[] arr = {100, 20, 125, 28, 34};
        int res = LargestElement.calculateLargest(arr);
        System.out.println("Largest Element :" + arr[res]);
    }
}
