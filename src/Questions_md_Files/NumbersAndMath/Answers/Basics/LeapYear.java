package Questions_md_Files.NumbersAndMath.Answers.Basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // divisible by 4 or divisible by 100 and divisible by 400
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = scan.nextInt();

        if (year <= 0) System.out.println("Invalid input");
        else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
        }
    }
}
