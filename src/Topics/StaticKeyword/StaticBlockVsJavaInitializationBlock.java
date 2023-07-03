package Topics.StaticKeyword;

public class StaticBlockVsJavaInitializationBlock {
    static  int age;
    static {
        System.out.println("Static Block");
        age=19;
    }

    static void disp(){
        System.out.println("Static Method");
        System.out.println(age);
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        /*
        During class loading only static variable allocated and static block executed.
        All the remain things in the class will be executed according to the programmer.
        To execute the disp() we have to call them but the main() method is called by JVM.

         */
        disp(); // Method is in same class. No need to write class name.
    }
}
