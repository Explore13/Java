package Topics.Encapsulation;
class Student_2 {
    private String name;
    private int age;

    /*
    public void setData(){
        name="Surya";
        age=19;

    }
     */

    public void setData1(int a){
        age=a;
    }
    public void setData2(){
        name="Surya";
    }

    public void show(){
        System.out.println(name+" "+age);
    }
}
public class Private_Member {
    public static void main(String[] args) {
        Student_2 obj=new Student_2();
        Student_2 obj1=new Student_2();
       // obj.setData();
      //  obj1.setData(); //if we comment this line then value would be null 0
        obj.setData1(18);
        obj1.setData1(19);
        obj1.show(); //null 19
        obj.show(); //null 18 because have not called setData2()

    }
}
