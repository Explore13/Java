package Questions_md_Files.Arrays.Answers;

import java.util.Scanner;

class Solution {
    public void twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < target) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println("\nThe indexes are : " + i + " " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("\nNot Found");
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size : \n");
        int n = scanner.nextInt();
        System.out.println("Enter the Target : \n");
        int target = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements : \n");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Solution sol = new Solution();
        sol.twoSum(arr, target);
    }
}
