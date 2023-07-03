package MyPracticePage.IfElse;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter temp in Fahrenheit: ");
        double F=scan.nextDouble();
        double C=((F-32)*5)/9;
        System.out.println("Temp in Celsius: "+C);
    }
}
