package MyPracticePage.IfElse;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Height: ");
        int height=scan.nextInt();
        System.out.println("Enter Base: ");
        int base=scan.nextInt();

        double area=0.5*height*base;
        System.out.println("Area of the Triangle: "+area);
    }
}
