package Knowledge;

import java.rmi.StubNotFoundException;

class Student{
    private int age;
    private String name;
    Student(){
        this("Subha",20);
        System.out.println("Default Constructor");
        name="Surya";
        age=19;
    }
    Student(String name){
        this();
        this.name=name;
        age=18;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public  void disp(){
        System.out.println(name+" "+age);
    }
}
public class ThisVSSuper {
    public static void main(String[] args) {
        Student st1=new Student();
        st1.disp();
        Student st2=new Student("Ramen");
        st2.disp();

    }
}
