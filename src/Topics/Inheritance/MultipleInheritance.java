package Topics.Inheritance;
class Parent1   // extends Object //Behind the scene
{
 int age=18;
}
class Parent2 //extends Object
{
}
class Child extends Parent1 //,extends Parent2 error
{

}

public class MultipleInheritance {
    public static void main(String[] args) {
     Child ch=new Child();
        System.out.println(ch.age);
    }
}
