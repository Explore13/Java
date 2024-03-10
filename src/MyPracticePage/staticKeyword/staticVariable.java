package MyPracticePage.staticKeyword;
class Laptop{
    private String name; // instance variable
    static int price; // static variable


    static {
        // Static Block
        price = 450000;
        System.out.println("Static Block is created at the time of Class Loading");
        System.out.println(price);

    }

    public Laptop(String name) {
        // Constructor
        this.name = name;
    }

    public static void getPrice()
    {
        // Static Method
        System.out.println("From Static Method : "+price);
        // System.out.println(name); Non static variable can not access from Static Method
    }

    public void getData()
    {
        System.out.println("Laptop Details : "+name + " "+price);
    }
}
public class staticVariable {
    public static void main(String[] args) {
        Laptop laptop_1 = new Laptop("ASUS");
        Laptop.price = 10000;
        laptop_1.getData();
        Laptop laptop_2 = new Laptop("Lenovo");
        Laptop.price = 20000;
        laptop_2.getData();

        Laptop.getPrice(); // We can call a static method using ClassName

        // Laptop.getData();  non-static method getData() cannot be referenced from a static context

    }
}
