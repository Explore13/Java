package MyPracticePage.Loops.Qustions;

import java.util.Scanner;

public class ReverseNaturalNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=scan.nextInt();
        for (int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
}
