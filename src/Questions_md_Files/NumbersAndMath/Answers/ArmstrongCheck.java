package Questions_md_Files.NumbersAndMath.Answers;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int number = scan.nextInt();

        // Calculate digits
        int digit = 0, n = number, sum = 0;
        while (n > 0) {
            ++digit;
            n /= 10;
        }
        // Calculate armstrong
        n = number;
        while (n > 0) {
            int ld = n % 10;
            sum += Math.pow(ld, digit);
            n /= 10;
        }

        if (sum == number)
            System.out.println(number + " is an Armstrong Number.");
        else
            System.out.println(number + " is not an Armstrong Number.");
    }
}
