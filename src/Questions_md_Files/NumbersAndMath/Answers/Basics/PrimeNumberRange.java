package Questions_md_Files.NumbersAndMath.Answers.Basics;

import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting point : ");
        int start = scan.nextInt();
        System.out.println("Enter ending point : ");
        int end = scan.nextInt();

        if (start > end || start < 1 || end < 1)
            System.out.println("Invalid starting and ending point");
        else {
            System.out.println("Prime Numbers are : ");
            for (int i = start; i <= end; i++) {
                Boolean flag = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                    System.out.print(i + ", ");
            }
        }
    }
}
