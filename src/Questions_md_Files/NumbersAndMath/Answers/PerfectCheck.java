package Questions_md_Files.NumbersAndMath.Answers;

import java.util.Scanner;

public class PerfectCheck {
    public static void main(String[] args) {
        // take number as input
        // find divisors
        // for i = 2 to i < num/2 i++
        // if num% i == 0
        // sum = sum + i + num/i
        // if sum == num then perfect
        // do not include the number itself

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();

        if(num < 0)
            System.out.println("It must be a positive number.");

        int sum = 1;
        for (int i = 2; i < Math.sqrt(num) ; i++) {
            if(num % i == 0)
            {
                int quotient = num / i;
                sum = sum + i + quotient;
            }
        }

        if(num == sum && sum != 1)
            System.out.println(num + " is a perfect number.");
        else
            System.out.println(num + " is not a perfect number.");
    }
}
