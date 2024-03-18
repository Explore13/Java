package Topics._15_StaticKeyword;
public class ClassloaderAndJVM {
    static int a;
    static {
        a=10;
        System.out.println("Static Memory Initialized");
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
/*
Basically execution starts from main method,but while static variables
are there inside the class. Then we know static variables are allocated and
initialized during class loading inside the heap memory. So,the execution starts
from static variables.

Details in NoteBook
 */