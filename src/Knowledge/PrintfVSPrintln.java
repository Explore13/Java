package Knowledge;

import java.util.Scanner;

public class PrintfVSPrintln {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Integer Value: ");
        int a=scan.nextInt();
        System.out.println("Enter Double Value: ");
        double b=scan.nextDouble();
        System.out.println("Integer Value: "+a);
        System.out.println("Double Value: "+b);
        System.out.printf("Integer Value: %d%n",a);
        System.out.printf("Integer Value: %.2f",b);
        /*
        1. To print decimal value to the particular digit after (.) we have to use System.out.printf()
        Syntax: System.out.printf("%d",a); ------> %d is the format specifier for integer.

        2. To get new line in System.out.printf ------> %n,\n is used

        3. System.out.printf("Value: "+a); also works.
         */
    }
}
