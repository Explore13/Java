package MyPracticePage.IfElse;

import java.util.Scanner;


public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();

        double D=(b*b)-(4*a*c);

        if (D==0){
            double root=(-b)/(2*a);
            System.out.println("Roots are: "+root);
        }
        else if(D>0){
            double sq=Math.sqrt(D);
            double root1=((-b)+sq)/(2*a);
            double root2=((-b)-sq)/(2*a);
            System.out.println("Roots are: "+root1+" and "+root2);
        }
        else {
            double sq=Math.sqrt(-D);
            double firstPart=(-b)/(2*a);
            double secondPart=sq/(2*a);
            System.out.printf("Roots are: %.2f+%.2fi and %.2f-%.2fi%n", firstPart, secondPart, firstPart, secondPart);
        }

        // To understand better,go to src/Knowledge/PrintfVSPrintln
    }
}
