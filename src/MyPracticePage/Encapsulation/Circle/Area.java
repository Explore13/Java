package MyPracticePage.Encapsulation.Circle;

import java.util.Scanner;

class Circle
{
    private double radius;
    static double PI=3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        double area;
        area= PI*Math.pow(radius,2.0);
        return area;
    }
}
public class Area {
    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println("Enter the radius of a circle: ");
        Scanner scan=new Scanner(System.in);
        double radius=scan.nextInt();
        c.setRadius(radius);
        double area=c.calculateArea();
        System.out.println("Area : "+area);

    }
}
