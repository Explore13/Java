package Logic_Building.Arrays.Sliding_Window;

public class Longest_SubArray_With_Zeros {
    private static int findSubArray(int[] arr, int k) {
        int l = 0, r = 0, maxLen = 0, countZero = 0;
        while (r < arr.length) {
            if (countZero > k){
                ++l;
             if(arr[l] == 0) countZero--;
            }
            else if (arr[r] == 0) ++countZero;
            maxLen = Math.max(maxLen, r - l + 1);
            ++r;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println("Longest SubArray with zeros : " + findSubArray(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println("Longest SubArray with zeros : " + findSubArray(new int[]{0,0,1,1,1,0,0}, 1));
        System.out.println("Longest SubArray with zeros : " + findSubArray(new int[]{1,1,1,1}, 0));
    }
}
