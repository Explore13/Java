package Topics._25_Stack;

import java.util.Arrays;

public class _3_Area_Under_Histogram {
    private static int area(int[] arr) {
        int n = arr.length;
        int[] prev_smaller = new int[n - 1];
        int[] next_smaller = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            int j = i - 1, flag = 0;
            while (j >= 0) {
                if (arr[j] < arr[i]) {
                    prev_smaller[i] = j;
                    flag = 1;
                    break;
                }
                j--;
            }
            if (flag == 0) prev_smaller[i] = -1;

            j = i + 1;
            flag = 0;
            while (j < n - 1) {
                if (arr[j] < arr[i]) {
                    flag = 1;
                    next_smaller[i] = j;
                    break;
                }
                j++;
            }
            if (flag == 0) next_smaller[i] = n - 1;
        }
        System.out.println("Prev => " + Arrays.toString(prev_smaller));
        System.out.println("Next => " + Arrays.toString(next_smaller));

        int max_area = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            // width = next_smaller[i] - prev_smaller[i] - 1
            // height = arr[i]
            int area = (next_smaller[i] - prev_smaller[i] - 1) * arr[i];
            max_area = Math.max(max_area, area);
        }

        return max_area;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 1, 5, 6, 3, 2, 4, 2, -1};
        System.out.println("Max area of the histogram = " + area(arr));
    }
}
