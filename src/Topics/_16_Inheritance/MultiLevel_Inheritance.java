package Topics._16_Inheritance;
class Demo1
{
    void disp(){
        System.out.println("Display Written in Demo1");
    }
}
class Demo2 extends Demo1
{
    void sleep(){
        System.out.println("We need sleep");
    }
}
class Demo3 extends Demo2
{
void hello(){
    System.out.println("Hello Explorer");
}
}
public class MultiLevel_Inheritance {
    public static void main(String[] args) {
    Demo1 d1=new Demo1();
    Demo2 d2=new Demo2();
    Demo3 d3=new Demo3();
    d1.disp();
    // d1.sleep(); Error
    // d1.hello(); Error
    d2.disp();
    d2.sleep();
    // d2.hello();  Error
    d3.disp();
    d3.sleep();
    d3.hello();
    }
}
