package MyPracticePage.IfElse;

import java.util.Scanner;

public class Largest_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=scan.nextInt();
        System.out.println("Enter b: ");
        int b=scan.nextInt();
        System.out.println("Enter c: ");
        int c=scan.nextInt();
        if (a>=b&&a>=c){
            System.out.println(a+" is the largest");
        }
        else if(b>=c){
            System.out.println(b+" is the largest");
        }
        else {
            System.out.println(c+" is the largest");
        }
    }
}
