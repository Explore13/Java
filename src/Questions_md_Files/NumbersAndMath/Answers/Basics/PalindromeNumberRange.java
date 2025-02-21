package Questions_md_Files.NumbersAndMath.Answers.Basics;

import java.util.Scanner;

public class PalindromeNumberRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a starting of the range : ");
        int start = scan.nextInt();
        System.out.println("Enter the ending of the range : ");
        int end = scan.nextInt();

        if(start > end || start < 0 || end < 0)
            System.out.println("Invalid Range");
        else {
            System.out.println("Palindrome Numbers are : ");
            for (int i = start; i <=end ; i++) {
                int value = i, condCheck = i, reverse = 0;
                while(condCheck > 0)
                {
                    int ld = condCheck % 10;
                    reverse = reverse * 10 + ld;
                    condCheck /= 10;
                }
                if(value == reverse)
                    System.out.print(value+",");
            }
        }
    }
}
