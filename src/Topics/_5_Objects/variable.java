package Topics._5_Objects;

public class variable {
    // Instance Variable :  Created inside the class but outside any method
    // It is created in Heap Memory during object creation.
    // It is initialized with default values like 0 , Null etc.
    // Scope is the object. It will be there inside the heap memory until the object destroyed.
    int a;
    int b = 5; // Initialized with 5
    String name;

    public static void main(String[] args) {

        // Local Variable :  Created in anywhere, scope is the block where it is created.
        // It is created in Stack Memory, we have to initialize the variable with values

        int n;
        // System.out.println(n); // Error because n is not initialized with values
        int num = 10;

        System.out.println("Local Variable : \nnum = " + num);


        // Creating Object

        variable obj = new variable();

        System.out.printf("\nInstance Variable : \nobj.a = %d\nobj.b = %d\nobj.name = %s", obj.a, obj.b, obj.name);

        obj.a = 100;
        obj.b = 200;
        obj.name = "Surya";
        System.out.printf("\nInstance Variable after changing values : \nobj.a = %d\nobj.b = %d\nobj.name = %s", obj.a, obj.b, obj.name);


        /*
        Object is created in stack memory and instance variable is created in heap memory.
        While any method is completed, object (stack memory) is destroyed and heap memory is
        deleted by Garbage Collector
         */
    }
}
