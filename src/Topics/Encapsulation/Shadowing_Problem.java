package Topics.Encapsulation;
class Student_3 {
    private String name;
    private int age;
    /*
    public void setData1(int a){
        age=a;
    }
     */

    public void setData1(int age){
        age=age; //we think, instance variable=value of local variable,,,But! local variable is reinitialized here.
        /*
        If both local and instance variable have the same name inside a method,then JVM
        will give preference for local variable. This is called Shadowing Problem.
         */
    }
    public void setData2(){
        name="Surya";
    }

    public void show(){
        System.out.println(name+" "+age);
    }
}
public class Shadowing_Problem {
    public static void main(String[] args) {
        Student_3 obj=new Student_3();
        Student_3 obj1=new Student_3();

     /*
        obj.setData1(18);
        obj1.setData1(19);
        obj1.show(); //null 19
        obj.show(); //null 18 because have not called setData2()
      */

        obj.setData1(18);
        obj1.setData1(19);
        obj1.show(); //value we think null 19 but value: null 0
        obj.show(); // value we think null 18 but value: null 0
    }
}
