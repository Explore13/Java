package Questions_md_Files.NumbersAndMath.Answers.Basics;

import java.util.Scanner;

public class SumofAP_Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first term : ");
        float a = scan.nextFloat();
        System.out.println("Enter the common difference : ");
        float d = scan.nextFloat();
        System.out.println("Enter the number of terms in A.P : ");
        int n = scan.nextInt();

        if (n <= 0) System.out.println("Invalid input");
        else {
            float sum = (float) (n/2) * ( (2 * a) + ((n-1)*d));
            System.out.println("Sum of the series : " + sum);
        }
    }
}
