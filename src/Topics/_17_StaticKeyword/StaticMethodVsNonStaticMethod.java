package Topics._17_StaticKeyword;
class Method{
    static void disp1(){
        System.out.println("Static Method");
    }
    void disp2(){
        System.out.println("Non Static Method");
    }
}
public class StaticMethodVsNonStaticMethod {
    public static void main(String[] args) {
        Method m=new Method();
        Method.disp1(); //Static method can be invoked using class name,no need to create an object.
        //Method.disp2(); But non-static method can not be invoked using class name,always an object is needed.
        m.disp2(); //Non-static method can be invoked using objects.
        m.disp1(); //Static method can also be invoked using object name.
    }
}
