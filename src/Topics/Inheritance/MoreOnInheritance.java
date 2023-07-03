package Topics.Inheritance;
class Human1{
    int age;
    private String name;

    Human1(){
        System.out.println("Human Constructor");
    }
    void sleep(){
        age=19;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1{
   // Student1(){
     //   super();
    //}
    void disp(){
        System.out.println("The age is : "+age);
        //System.out.println("The name is : "+name); //Error
        /*
        Private members can not be inherited.
        We have to use setters getters to access the private members.
        In Encapsulation,we learn that private members can not be accessed
        from another class
         */
    }
}
public class MoreOnInheritance {
    public static void main(String[] args) {
Student1 st=new Student1();
st.sleep();
st.disp();

    }
}

/*
More on the notes....
 */