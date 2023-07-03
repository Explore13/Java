package MyPracticePage.IfElse;

import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter temp in Celsius: ");
        double C=scan.nextDouble();
        double F=(((9*C)/5)+32);
        System.out.println("Temp in F: "+F);
    }
}
