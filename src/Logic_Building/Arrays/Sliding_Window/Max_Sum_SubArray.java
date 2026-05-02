package Logic_Building.Arrays.Sliding_Window;

public class Max_Sum_SubArray {
    private static int maxSum(int[] arr, int k) {
        int l = 0, r = k - 1, sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        int maxSum = sum;

        while (r < arr.length - 1) {
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Max sum : " + maxSum(new int[]{2, 1, 5, 1, 3, 2}, 3));
        System.out.println("Max sum : " + maxSum(new int[]{4,2,1,7,8,1,2,8,1,0}, 3));
        System.out.println("Max sum : " + maxSum(new int[]{1,1,1,1,1,1,1,1,1}, 2));
    }
}
