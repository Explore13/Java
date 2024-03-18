package MyPracticePage.staticKeyword;

class Method{
    public static void disp1()
    {
        System.out.println("Static Method");
    }

    public void disp2()
    {
        System.out.println("Non Static Method");
    }

}
public class staticMethodVSnonStaticMethod {
    public static void main(String[] args) {
        Method.disp1(); // Static Method

        // Method.disp2(); Non-Static Method can not be accessed using ClassName

        Method m1 = new Method();
        m1.disp2(); // Non-Static method
        m1.disp1(); // Static method can be accessed using Object Name
    }
}
