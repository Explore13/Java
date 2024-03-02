package Topics._2_Operators;

public class Increment_Decrement {
    // Welcome to Explorer's JDK
    public static void main(String[] args) {
        int a = 5;


/*
 a++;
 int c=a++,d=++a;
*/
        int b;
        b = a++ + ++a + ++a + a++ + --a + a--;
        System.out.println(a);
        System.out.println(b);
    }

}
