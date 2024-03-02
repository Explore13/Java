package Topics._5_Objects;

public class Laptop {
    int price;
String brand;
String colour;
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.price = 42000;
        myLaptop.colour = "Grey";
        myLaptop.brand = "Lenovo";
        System.out.println("My Laptop : "+myLaptop.brand+" "+myLaptop.colour+" "+myLaptop.price);
    }
}
