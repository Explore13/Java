package Questions_md_Files.NumbersAndMath.Answers;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int value = scan.nextInt();
        if (value < 1) System.out.println("Number must be greater than 1");
        else if (value == 1) System.out.println("1 is neither prime pr non-prime");
        else {
            for (int i = 2; i <= value / 2; i++) {
                if (value % i == 0) {
                    System.out.println(value + " is not a prime number.");
                    return;
                }
            }
            System.out.println(value + " is a palindrome number.");
        }
    }
}
