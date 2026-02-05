package Logic_Building.Arrays;

public class CheckSortedArray {
    private static boolean isSorted(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Input array must not be null");
        // TC : O(n), SC : O(1)
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) return false;
        return true;
    }

    public static void main(String[] args) {
        try {
            int[] arr = new int[]{1, 2, 3, 4, 5};
            System.out.println(isSorted(arr) ? "Array is sorted" : "Array is not sorted");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
