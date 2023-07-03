package MyPracticePage.IfElse;

import java.util.Scanner;

public class PositiveNegativeZeroCheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int num=scan.nextInt();
        if (num==0){
            System.out.println("It's Zero");
        } else if (num>0) {
            System.out.println("It's a non-zero positive number");
        }
        else {
            System.out.println("It's a Negative Number");
        }
    }
}
