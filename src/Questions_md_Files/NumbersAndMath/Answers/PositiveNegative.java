package Questions_md_Files.NumbersAndMath.Answers;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();

        if (num < 0)
            System.out.println(num + " is a negative number.");
        else
            System.out.println(num + " is a positive number.");
    }
}
