package MyPracticePage.Inheritance;

class Father{
    private int money;

    public Father()
    {
        System.out.println("Father Constructor");
        money = 40000;

    }

    public void moneyBag(){
        System.out.println("Father has Rs. "+money);
    }
}

class Child extends Father{
    // money = 50000; private variable

    public Child()
    {
        // super();

        System.out.println("Child Constructor");
        moneyBag();
    }
}
public class PrivateCases {
    public static void main(String[] args) {

        Child ch = new Child();
        ch.moneyBag();

        // System.out.println(ch.money); money has private access in MyPracticePage.Inheritance.Father

        Father f = new Father();
        f.moneyBag();
        // System.out.println(f.money); money has private access in MyPracticePage.Inheritance.Father
    }
}
