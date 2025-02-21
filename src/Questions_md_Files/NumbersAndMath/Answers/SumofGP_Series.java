package Questions_md_Files.NumbersAndMath.Answers;

import java.util.Scanner;

public class SumofGP_Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first term : ");
        float a = scan.nextFloat();
        System.out.println("Enter the common ratio : ");
        float r = scan.nextFloat();
        System.out.println("Enter the number of terms in G.P : ");
        int n = scan.nextInt();

        if (n <= 0) System.out.println("Invalid input");

        else {
            float sum = (float) (a * (Math.pow(r, n) - 1)) / (r - 1);
            System.out.println("Sum of the G.P Series : " + sum);
        }
    }
}
