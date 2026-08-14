package DSA.LinkedList.Prefix_Sum;

import java.util.*;

public class PrefixSum_1D {
        static int[] subarraySum(int[] nums) {
            int len = nums.length;

            int []prefix = new int[len+1];
            prefix[0] = nums[0];

            for(int i = 0; i < len; i++){
                int sum = prefix[i] + nums[i];
                prefix[i+1] = sum;
            }
            return prefix;
        }

        static int sum(int []prefix, int i, int j){
            return prefix[j+1] - prefix[i];
        }
    public static void main(String[] args) {
        int []nums = {10,20,30,40,50};
        int []prefix = PrefixSum_1D.subarraySum(nums);

        System.out.println(Arrays.toString(prefix));

        System.out.println(PrefixSum_1D.sum(prefix,2,4));
        System.out.println(PrefixSum_1D.sum(prefix,0,2));
        System.out.println(PrefixSum_1D.sum(prefix,1,3));


    }
}
