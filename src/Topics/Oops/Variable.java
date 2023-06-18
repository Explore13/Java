package Topics.Oops;

public class Variable{
    //Instance Variable --> Inside the class but outside the method
    int a=2;
    String name="Explorer";
    public static void main(String[] args) {
        //METHOD=>Declare inside  the main()
        // Instance Variable is declared inside the method
        //declare the variable
        //create the object
        // int num=9; --> Primitive
        Variable obj= new Variable(); //reference,who refers an object
        Variable obj2= new Variable();
        obj.name="Surya";

        System.out.println(obj.name);
        System.out.println(obj.a);


        System.out.println(obj2.name);
        System.out.println(obj2.a);
    }
}