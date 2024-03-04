package MyPracticePage.Encapsulation.Laptop;

class Laptop {
    String name;
    int price;

    public void showData() {
        System.out.println("Name of the Laptop : " + name + " and Price : " + price);
    }

}


class Laptop_1{
    private String name;
    private int price;

    public void setName(String name,int price) {
        name = name; // Data set to the local variable, not to the instance variable
        // JVM will give more preference to the local variable over instance variable
        // This problem is called Shadowing Effect
        price = price;
    }
    public void showData()
    {
        System.out.println("\nShadowing Problem Class : \n"+name+" "+price);// null 0
    }
}


class EncapsulatedLaptop {
    private String name;
    private int price;

    public void setName(String name) {
        this.name = name;
        // To solve shadowing effect we use "this" keyword
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    // set and get are a standard followed in JAVA
    // setVariableName ---> set the data to the obj
    // getVariableName ----> get the data of the obj
    // set ---> public void
    // get ---> public (dataType) ---> It returns the data
}

public class Encapsulation {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();
        myLaptop.name = "Lenovo";
        myLaptop.price = 40000;
        myLaptop.showData();
        // We are changing values from another Class easily
        Laptop myNewLaptop = new Laptop();
        myNewLaptop.name = "ASUS";
        myNewLaptop.price = 49000;
        myNewLaptop.showData();


        // Shadowing Effect class
        Laptop_1 myLaptop1 = new Laptop_1();
        myLaptop1.setName("ASUS",49000);
        myLaptop1.showData();



        // Encapsulated Class : make private to the Instance variable so that no one can access directly from another class
        EncapsulatedLaptop newLaptop = new EncapsulatedLaptop();
        // we need a method to provide data to the class
        // To set the data to the object we use "set" and to print we use "get"

        newLaptop.setName("Lenovo");
        newLaptop.setPrice(40000);
        System.out.println("\nEncapsulated Class with set-get and this :  \n"+newLaptop.getName()+" "+newLaptop.getPrice());



    }
}
