package Logic_Building.Arrays;

public class SecondLargestElement {
    private static int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num < first && num > second) {
                second = num;
            }
        }
        return first == second || second == Integer.MIN_VALUE ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3};
        int value = SecondLargestElement.getSecondLargest(arr);
        if (value == -1) System.out.println("No second largest element is there");
        else System.out.println("Second Largest Element : " + value);
    }
}
