package MyPracticePage.Encapsulation.Rectangle;

import java.util.Scanner;

/*
 Create a class called `Rectangle` with private instance variables `length` and `width`. Implement getter and setter methods for both variables.
  Include a method called `calculatePerimeter()` that returns the perimeter of the rectangle.
 */
class Rectangle{
    private double length;
    private double width;
    public void setData(double length,double width)
    {
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double calcPerimeter(){
        return (2*(length+width));
    }
}
public class PerimeterCheck {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Scanner scan=new Scanner(System.in);
        double length=scan.nextDouble();
        double width=scan.nextDouble();
        r.setData(length,width);
        double rPerimeter=r.calcPerimeter();
        System.out.println("Perimeter : "+rPerimeter);
    }
}
