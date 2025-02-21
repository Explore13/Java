package Questions_md_Files.NumbersAndMath.Answers;

import java.util.Scanner;

public class Factorial_Iteration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();

        if (num < 0) System.out.println("Invalid Number");
        else {
            long fact = 1;
            for (int i = 2; i <= num; i++) {
                fact *= i;
            }
            System.out.println(num + "! = " + fact);

        }
    }
}
