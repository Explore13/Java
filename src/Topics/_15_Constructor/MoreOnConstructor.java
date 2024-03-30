package Topics._15_Constructor;

class Demo {
    private int a;
    private int b;

    /*
     * When we call any constructor but have not added any constructor here, then the
     * compiler adds a default constructor here. It is a zero-parameterized constructor.
     *
     * public Demo() {
     *
     * }
     */
    public Demo() {
        System.out.println("Zero Parameterized constructor by Programmer");
    }

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a + " " + b);
    }
}

public class MoreOnConstructor {
    public static void main(String[] args) {
        Demo d = new Demo(); // Constructor Call

        /*
         * But when we added a constructor, then the default constructor will not be
         * included.
         */

        d.display();

        /*
         * d.add(); // Method call, but it is not defined in the Demo class. It shows
         * error.
         *
         * But why when the constructor is not there, constructor call is not showing
         * any error.
         */

        Demo d2 = new Demo(10, 20); /*
         * Default Constructor is zero-parameterized constructor. So, when we pass data to
         * the constructor, then default is not added.
         */

        d2.display();

        /* ----------NOTE---------- */

        /*
         * 1. When I am calling any constructor (default, zero-parameterized) during
         * the object creation, then behind the scene, a zero-parameterized constructor
         * will be added by default.
         *
         * 2. When I am calling any constructor with data during the object creation,
         * then behind the scene, a zero-parameterized constructor will not be added
         * by default. Now, we have to add a parameterized constructor.
         *
         * 3. But when we add a constructor then the compiler will not add any default
         * constructor.
         *
         * Imp: The default constructor will be added by the compiler if there is no
         * constructor which is initialized by a programmer. OR If there is no
         * constructor initialized by a programmer then the compiler will create a
         * default constructor (Zero Parameterized).
         */
    }
}


/*
* In the code "Demo d = new Demo();", the elements are as follows:

* 1. Class : `Demo` is the name of the class. In Java, a class is a blueprint or template for creating objects.

* 2. New : `new` is a keyword in Java used to create new objects.
            It dynamically allocates memory for an object and returns a reference to it.

* 3. Constructor : In this line of code, `Demo()` is the constructor.
                 A constructor is a special method in a class that has the same name as the class and is used to initialize objects of that class.
                 If no constructor is explicitly defined in the class, Java provides a default constructor.
                 In this case, `new Demo()` is invoking the default constructor, which is a zero-parameter constructor
                 because it doesn't take any arguments.
 */