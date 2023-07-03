package Topics.Inheritance;
class Human{ // Parent Class/Super Class/Base Class
    int age;
    void sleep(){
        age=19;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student extends Human{
//After adding extends Human,Student becomes child class/sub class/derived class of Human Class
}
public class Introduction {
    public static void main(String[] args) {

        /*
        The process where one class acquiring properties and behaviour
        of another class.
         */
        Human hu=new Human();
        hu.sleep();
        Student st=new Student();
        st.sleep();
        /* When there is no link b/w Human and Student class,it will show error.
        After adding extends Human in Student class it becomes child class of Human class,and it works.
         */

    }
}
