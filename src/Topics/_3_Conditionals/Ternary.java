package Topics._3_Conditionals;


public class Ternary {
    // Welcome to Explorer's JDK
    public static void main(String[] args) {
        int a = 4, b = 6, c = 5;
        System.out.println((a < b) ? "a is less than b" : "b is less than a");
        String value = (a < b) ? ((a > c) ? "a is less than b and greater than c" : "a is less than b and c") : "a is greater than b";
        System.out.println(value);


        // int age = 16;        // Declare and Assign the value 16 to the variable 'age'

// Ternary operator usage:
//(condition) ? (expression if true) : (expression if false)
// (age <= 17) ? System.out.println("Big") : System.out.println("Small");

// If 'age' is less than or equal to 17, it prints "Big";
// Otherwise, it prints "Small"

    }

}
