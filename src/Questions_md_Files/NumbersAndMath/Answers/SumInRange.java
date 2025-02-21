package Questions_md_Files.NumbersAndMath.Answers;

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting point : ");
        int start = scan.nextInt();
        System.out.println("Enter end point : ");
        int end = scan.nextInt();

        if (start < 0 || end < 0) System.out.println("Range must be positive number.");
        else {
            float sum = 0;
            if (start < end) for (int i = start; i <= end; i++) {
                sum = sum + i;
            }
            else for (int i = start; i >= end; i--) {
                sum = sum + i;
            }
            System.out.println("Sum of the numbers in between " + start + " to " + end + " is : " + sum);
        }
    }
}
