package Topics._16_Inheritance;
class DemoClass{
    int a,b;
    public DemoClass(){
        System.out.println("Parent Class Constructor");
    }
    public DemoClass(int x,int y){
        a=x;
        b=y;
        System.out.println("Parameterized Parent Class Constructor");
    }
}

class DemoClass1 extends DemoClass{
    int m,n;
    public DemoClass1(){
        // this(); recursive constructor invocation
        /*
        super(); By default it is added by JVM.It will call
        the zero parameterized constructor is in Parent Class.
         */
        System.out.println("Child Class Constructor");
    }
    public DemoClass1(int x,int y){
         /*
        super();---> It is zero parameterized method... By default, it is added by JVM.It will call
        the zero parameterized constructor is in Parent Class.
         */

        /* super(x,y); ---> Parameterized method, it will call the parameterized constructor in the Parent Class.
        System.out.println("Child Class Parameterized Constructor");
         */
         m=x;
         n=y;
    }
}

class DemoClass2 extends DemoClass{
    int p,q;
    public DemoClass2(){
        this(4,5); // It will call parameterized constructor is in the same class.
        // this(3,4,5); ---> Error, No Three Parameterized Constructor inside the same class.
        System.out.println("DC2 Constructor");
    }
    public DemoClass2(int x,int y){
        super(x,y); // Parameterized Method, it will call Parents class Parameterized Constructor
        System.out.println("DC2 Parameterized Constructor");
        p=x;
        q=y;
    }
}
public class Constructor_Execution {
    public static void main(String[] args) {
        DemoClass1 d1=new DemoClass1(); /* Constructor Call. */
        DemoClass1 d2=new DemoClass1(10,20);

        DemoClass2 dc1=new DemoClass2();
        DemoClass2 dc2=new DemoClass2(30,40);
    }
}

/*
Read the NoteBook
 */