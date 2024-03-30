package Topics._15_Constructor;

class StudentData{
    private String name;
    private int age;
    StudentData(){
        System.out.println("Default Constructor is called");
        name="Surya";
        age=19;
    }
    StudentData(String name){
        this.name=name;
        age=18;
    }
    StudentData(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println(name+" "+age);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
StudentData st1=new StudentData();
st1.display();
StudentData st2=new StudentData("Subhajyoti");
st2.display();
StudentData st3=new StudentData("Ramen",19);
st3.display();
    }
}
