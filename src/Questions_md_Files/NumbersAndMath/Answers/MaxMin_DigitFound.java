package Questions_md_Files.NumbersAndMath.Answers;

import java.util.Scanner;

public class MaxMin_DigitFound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();

        if (num < 0) System.out.println("Invalid Number");
        else if (num % 10 == num) System.out.println("Max and Min : " + num);
        else {
            int n = num / 10, max = num % 10, min = num % 10;
            while (n > 0) {
                int ld = n % 10;
                if(ld > max)
                    max = ld;
                else if (ld < min)
                    min = ld;

                n /= 10;
            }
            System.out.println("Max : " + max + " Min : " + min);
        }
    }
}
