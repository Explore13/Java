package MyPracticePage.Encapsulation.Employee;

import java.util.Scanner;

class Employee
{
    private int salary;
    private String name;
    private final String designation;

    /*
    final keywords exists when aN object is created. And it should have a value which will remain
    same throughout the object. But a method of a class may be or may not be called in an object. But constructor
    must be called during object creation. So, we can initialize value to a final variable during object creation
    inside a constructor,and value could not be changed.
     */
    Employee(String designation){
        this.designation=designation;
    }


    public void setData(String name,int salary) {
        this.name = name;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDesignation(){
        return designation;
    }
    public double calculateBonus(){
        return 0.1*salary;
    }

}


    public class Details {
        public static void main(String[] args) {
            Employee e=new Employee("Developer");
            Scanner scan=new Scanner(System.in);
            String name=scan.nextLine();
            int salary=scan.nextInt();
            scan.nextLine();
            e.setData(name,salary);
            String eName= e.getName();
            int eSalary=e.getSalary();
            String eDesignation=e.getDesignation();
            double eBonus=e.calculateBonus();
            System.out.println("Details of the employee : "+eName+" "+eDesignation+" "+eSalary+" "+eBonus);

            Employee e1=new Employee("Web Developer");
            String name1=scan.nextLine();
            int salary1=scan.nextInt();
            scan.nextLine();
            e1.setData(name1,salary1);
            String eName1= e1.getName();
            int eSalary1=e1.getSalary();
            String eDesignation1=e1.getDesignation();
            double eBonus1=e1.calculateBonus();
            System.out.println("Details of the employee : "+eName1+" "+eDesignation1+" "+eSalary1+" "+eBonus1);

        }
}
