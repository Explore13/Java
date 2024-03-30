package Topics._17_StaticKeyword;

class Alpha{
    static  int a;
    static  int b;
    int m;
    int n;
    static{
        /*
        Static block to initialize static variables.
         */
        System.out.println("Static Block");
        a=10;
        b=20;
    }
    {
        /*
        Java Initialization Block to initialize the instance variables.
         */
        System.out.println("Non-Static Block");
        m=300;
        n=400;
    }


}
public class StaticVSInstance {
    public static void main(String[] args) {
        Alpha a1=new Alpha();
        Alpha a2=new Alpha();

        System.out.println(Alpha.a+" "+Alpha.b);
       // System.out.println(Alpha.m+" "+Alpha.n); Error
        System.out.println(a1.m+" "+a1.n);
    }
}
