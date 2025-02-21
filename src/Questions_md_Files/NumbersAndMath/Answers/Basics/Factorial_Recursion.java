package Questions_md_Files.NumbersAndMath.Answers.Basics;

import java.util.Scanner;

public class Factorial_Recursion {
    static long fact (int n)
    {
        if(n == 0) return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();

        if (num < 0) System.out.println("Invalid Number");
        else {
            long fact = fact(num);
            System.out.println(num +"! = " + fact);

        }
    }
}
