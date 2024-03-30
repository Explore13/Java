package Topics._14_Encapsulation;
class Student{
private String name;
private int age;

public void setData(){
    name="Surya";
    age=19;
}
public void show(){
    System.out.println(name+" "+age);
}
}
public class What_Is_Encapsulation {
    public static void main(String[] args) {
Student obj=new Student();

/*
When we make the variables private we can't access them from the outside of the parent class,So we will create another
method inside the parent class to initialize the values...
 */

/*
obj.name="Surya";
obj.age=19;
 */
        obj.setData();
        obj.show();
    }
}
