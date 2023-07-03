package Knowledge;
class Animal //extends Object (Behind the Scene)
{
    void sleep(){
        System.out.println("We need Sleep");
    }
}
class Tiger extends Animal{

}
class Monkey extends Animal{

}
public class DefaultParent {
    public static void main(String[] args) {
        Animal a=new Animal();
       /*
         When you click a. you can see multiple suggestions of
         methods,which is in Object Class (In-Build). It happens because
         the class Animal extends to Object,it happens behind the scene. We cannot see this.
         No need to write this.
        */

        Tiger t=new Tiger();
        /*
         When you click t. you can see multiple suggestions of
         methods,which is in Object Class (In-Build) and Animal Class. It happens because
         the class Animal extends to Object,it happens behind the scene. We cannot see this.
         As Animal class extends to Object , Tiger will also get the properties and Behaviour(prep+behv) of Object Class.
         It the example of Multi Level Inheritance.
         */

        /*
        Conclusion : Every Class in Java has the Property and Behaviour of Object Class(In-Build Class)
         */
    }
}
