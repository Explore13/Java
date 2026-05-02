package Logic_Building.Arrays;

public class ReverseArray {

    // TC = O(n), SC = O(1)
    private static void reverse(int[] arr) {
        if (arr == null || arr.length < 1) throw new IllegalArgumentException("Array must contain one element");
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            arr[i] += arr[n - i - 1];
            arr[n - i - 1] = arr[i] - arr[n - i - 1];
            arr[i] -= arr[n - i - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Before reversing : ");
        for (int a : arr) {
            System.out.print(" " + a);
        }
        ReverseArray.reverse(arr);
        System.out.println("\nAfter reversing : ");
        for (int a : arr) {
            System.out.print(" " + a);
        }
    }
}
