package Topics.Constructor;
class Demo{
private int a;
private int b;

/*
When we call any constructor but has not added any constructor here,
then compiler adds a default constructor here. It is zero parameterized
constructor.

public Demo()
{

}
 */
public Demo(){
    System.out.println("Zero Parameterized constructor by Programmer");
}

    public Demo(int a,int b){
        this.a=a;
        this.b=b;
    }
void display(){
    System.out.println(a+" "+b);
}
}
public class MoreOnConstructor {
    public static void main(String[] args) {
        Demo d=new Demo(); //Constructor Call
        /*
        But when we added a constructor,then default constructor will not
        be included.
         */


        d.display();
       /* d.add(); Method call,but is not there. It shows error.
       But why when constructor is not there,constructor call is
       not showing any error.
        */

        Demo d2=new Demo(10,20); /*
        Default Constructor is zero parameterized constructor.
        So,when we pass data to the constructor,then default is not added.
        */

        d2.display();

        /*----------NOTE----------*/

        /*
        1. When I am calling any constructor (default,zero parameterized) during the object creation,
           then behind the scene a zero parameterized constructor will be added by default.

        2. When I am calling any constructor with data during the object creation,
           then behind the scene a zero parameterized constructor will be not added by default.
           Now, we have to add a parameterized constructor.

        3. But when we add a constructor then compiler will not add any default constructor.

        Imp : The default constructor will be added by compiler if there is no constructor which is initialized
        by a programmer.
                                                OR
        If there is no constructor initialized by a programmer then compiler will create a default constructor
        (Zero Parameterized).
         */





    }
}
