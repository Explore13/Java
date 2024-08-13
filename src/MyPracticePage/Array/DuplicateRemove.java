package MyPracticePage.Array;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        ArrayList al = new ArrayList();
        int currentValue = nums[0];
        al.add(currentValue);
        for(int i = 1; i <= nums.length-1; i++)
        {
            if(nums[i] != currentValue)
            {
                currentValue = nums[i];
                al.add(currentValue);
            }
        }
        return al.size();
    }
}

class DuplicateRemove {

    public static void main(String[] args) {
        int [] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        Solution sol = new Solution();
        int temp = sol.removeDuplicates(nums);
        System.out.println(temp);
    }
}