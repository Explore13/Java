package Logic_Building.Arrays.Sliding_Window;

public class Longest_SubArray {
    private static int longestSubArray(int[] arr, int k) {
        int l = 0, r = 0, sum = 0, maxLen = 0;
        while (r < arr.length) {

            sum += arr[r];
            if (sum > k) {
                sum -= arr[l];
                ++l;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            r++;

        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println("Longest SubArray Length : " + longestSubArray(new int[]{4, 1, 1, 1, 2, 3, 5}, 5));
        System.out.println("Longest SubArray Length : " + longestSubArray(new int[]{1, 2, 3, 4, 5}, 7));
        System.out.println("Longest SubArray Length : " + longestSubArray(new int[]{5, 1, 2, 3, 4}, 6));
    }
}
