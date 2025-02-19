package Questions_md_Files.NumbersAndMath.Answers;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int value = scan.nextInt();

        if(value < 0)
            System.out.println("Number must be greater than 0");
        else
        {
            int x = value, reverse = 0;
            while(x > 0 )
            {
                int temp = x % 10;
                reverse = reverse  *10 + temp;
                x /= 10;
            }
            if(value == reverse)
                System.out.println(value + " is a palindrome number.");
            else
                System.out.println(value + " is not a palindrome number.");
        }
    }
}
