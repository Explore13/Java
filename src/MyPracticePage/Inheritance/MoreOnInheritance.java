package MyPracticePage.Inheritance;

class Laptop extends Object {
    private String name;

    public static int id;

    int price;

    static {
        id = 1000;
    }

    Laptop() {
        System.out.println("Zero Parameterized Constructor");
    }

    void service() {
        price = 45000;

        System.out.println("Laptop needs Servicing");
        System.out.println(price);
    }
}

class ASUS extends Laptop { // Child Class, Sub Class, Derived Class


    void change() {
        System.out.println("It needs Battery Change");
    }
}

public class MoreOnInheritance {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.service();
        ASUS a1 = new ASUS();
        a1.service();
        a1.change();
    }
}
