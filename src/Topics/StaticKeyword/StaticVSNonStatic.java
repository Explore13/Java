package Topics.StaticKeyword;
class Demo{
    static int a;
    static int b;
    int m;
    int n;
    static {
        System.out.println("Static Block");
        a=10;
        b=20;

    }
    {
        System.out.println("Non-Static Block");
        m=30;
        n=40;
    }
    static void disp1(){
        System.out.println("a= "+a+" b= "+b);
    }
    void disp2(){
        System.out.println("m= "+m+" n= "+n);
    }
}
public class StaticVSNonStatic {
    public static void main(String[] args) {
    Demo d=new Demo();
    Demo.disp1();
    d.disp2();
    }
}
