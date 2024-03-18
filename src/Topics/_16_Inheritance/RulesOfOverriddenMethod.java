package Topics._16_Inheritance;
class Animal1 {
   public void eat(){
        System.out.println("They eat everyday");
    }
    public void age(){
        System.out.println("Animal lives long");
    }

    public void arg(int x){
        System.out.println("Hello Developer");
    }
}
class Tiger1 extends Animal1
{

    /*
     void eat() {
        System.out.println("Tiger hunts and eat");
    }
    Rule:1
    We cannot decrease the visibility of a method.
    Here, public to default,which is not possible.
     */
public void eat() {
        System.out.println("Tiger hunts and eat");
    }
    /*
    public int age(){
    System.out.println("Animal lives long");
    }

    Rule:2
    We can't change the return type during overriding.
    */
    public void arg(){
        System.out.println("Hii Developer,It will not be overridden");
    }
    /*
    If we do not write parameters in the method inside the child class,then
    it will be considered as a new method which is the Specialized Method of Child Class.
     */




}
public class RulesOfOverriddenMethod {
    public static void main(String[] args) {
        Tiger1 t=new Tiger1();
        t.eat();
        t.arg(4);
        t.arg();
    }
}
