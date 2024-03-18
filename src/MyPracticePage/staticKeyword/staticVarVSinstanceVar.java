package MyPracticePage.staticKeyword;

class Variable{
    int a;
    int b;

    static int m;
    static int n;

    static
    {
        m = 10;
        n = 20;
    }

    {
        a =  5;
        b = 7;
    }
}
public class staticVarVSinstanceVar {
    public static void main(String[] args) {

        Variable var1 = new Variable();
        System.out.println(Variable.m + " "+ Variable.n); // static var can be accessed using ClassName
        System.out.println(var1.a+ " "+var1.b); // instance var can be accessed using object name only
        // System.out.println(Variable.a+" "+Variable.b);  Instance var can not be accessed using ClassName
        System.out.println(var1.m +" "+ var1.n); // we can access static var using object name also

    }

}
