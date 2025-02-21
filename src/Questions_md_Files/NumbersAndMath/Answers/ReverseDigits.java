package Questions_md_Files.NumbersAndMath.Answers;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();

        if (num < 0) System.out.println("Invalid Number");
        else if (num % 10 == num) System.out.println("Reverse of the number : " + num);
        else {
            int n = num, reverse = 0;
            while (n > 0) {
                int ld = n % 10;
                reverse = reverse * 10 + ld;
                n /= 10;
            }
            System.out.println("Reverse of the number : " + reverse);
        }
    }
}
