package Questions_md_Files.NumbersAndMath.Answers.Basics;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a range : ");
        int num = scan.nextInt();

        if (num < 0)
            System.out.println(num + " must be a positive number.");
        else {
            float sum = (float) (num * (num +1) / 2.0);
            System.out.println("Sum of the first " + num + " positive numbers : " + sum);
        }
    }
}
