package Questions_md_Files.NumbersAndMath.Answers.Basics;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        float first = scan.nextFloat();
        System.out.println("Enter the second number : ");
        float second = scan.nextFloat();
        System.out.println("Enter the third number : ");
        float third = scan.nextFloat();

        if (first == second && second == third) System.out.println("All are same.");
        else if (first > second && first > third ) System.out.println(first + " is greater than " + second + " and " + third);
        else if(second > third) System.out.println(second + " is greater than " + first + " and " + third);
        else System.out.println(third + " is greater than " + first + " and " + second);
    }
}
