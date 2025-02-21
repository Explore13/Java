package Questions_md_Files.NumbersAndMath.Answers.Basics;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        System.out.println("Enter the power : ");
        int power = scan.nextInt();

        double totalPower = Math.pow(num,power);
        System.out.println(num + " to the power of " + power + " = " + totalPower);
    }
}
