package MyPracticePage.Encapsulation.Car;

import javax.management.openmbean.SimpleType;
import java.util.Scanner;

/*
Q: Create a class called `Car` with private instance variables `make`, `model`, and `year`. Implement getter and setter methods for all the variables.
 Include a method called `isVintage()` that checks if the car is considered vintage (over 25 years old) and returns a boolean value.
 */
class Car{
    private String company;
    private String model;
    private int year;
    public void setData(String company,String model,int year){
        this.company=company;
        this.model=model;
        this.year=year;
    }
   public String getCompany(){
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    public boolean isVintage(){
        if ((2023-year)>=25){
            return true;
        }
        else {
            return false;
        }
    }
}
public class Vintage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String company=scan.next();
        String model=scan.next();

        int year=scan.nextInt();
        Car c=new Car();
        c.setData(company,model,year);
        String cCompany=c.getCompany();
        String cModel=c.getModel();
        int cYear=c.getYear();
        System.out.println("Car Details : "+cCompany+" "+cModel+" "+cYear);
        boolean check=c.isVintage();
        if (check){
            System.out.println("The car is vintage");
        }
        else {
            System.out.println("The car is not vintage");
        }

    }
}
