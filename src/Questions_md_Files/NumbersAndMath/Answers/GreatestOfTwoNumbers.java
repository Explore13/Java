package Questions_md_Files.NumbersAndMath.Answers;

import java.util.Scanner;

public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float first = scan.nextFloat();
        System.out.println("Enter the second number : ");
        float second = scan.nextFloat();

        if (first == second) System.out.println("Both are same.");
        else if (first > second) System.out.println(first + " is greater than " + second);
        else System.out.println(second + " is greater than " + first);
    }
}
