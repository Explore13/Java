package MyPracticePage.IfElse;

import java.util.Scanner;
class Calc{
    private double length;
    private double width;
  Calc(double length,double width){
      this.length=length;
      this.width=width;
  }
    public double Print(){
        return this.length * this.width;
    }
}
public class RectangleArea {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Length: ");
        double L=scan.nextDouble();
        System.out.println("Enter Width: ");
        double W= scan.nextDouble();
        Calc rec=new Calc(L,W);
        double area=rec.Print();
        System.out.printf("Area: %.2f%n",area);

    }
}
