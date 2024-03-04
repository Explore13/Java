package MyPracticePage.Constructor;

/*
Constructor : A special method in java which is used to initialize the Object,
and the method name is same as Class Name.

If there is no constructor , compiler creates a default constructor

Using construction, initialization of object is done at the time of object creation
*/
class Laptop {
    private String name;
    private double price;
    private int yearOfManufacturing;
    /*
    public Laptop()
    {
    // No need to add  as it is zero parameterized, it will be created automatically
    }
     */

    public void getDetails() {
        System.out.println("Laptop Details : " + name + " " + price + " " + yearOfManufacturing);
    }
}


class Book {
    private String bookName;
    private int price;

    public Book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }

    public void getDetails() {
        System.out.println("Book Details : " + bookName + " " + price);
    }
}



class Mobile{
    private String name;
    private double price;

    public Mobile()
    {
        System.out.println("Zero Parameterized constructor created by User");
    }

    public Mobile(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void getDetails()
    {
        System.out.println("Mobile Details : "+name+" "+price);
    }
}

public class Constructor {
    public static void main(String[] args) {

        Laptop newLaptop = new Laptop();
        /*
         * Laptop : class
         * Laptop() : constructor ( default constructor, zero parameterized..)
         * Zero Parameterized constructor or default constructor is created by the Compiler
         */

        /*
         Laptop newLaptop_2 = new Laptop("Lenovo",45000,2023); --->
         Here no parameterized constructor is added there so this object creation is wrong

        */

        newLaptop.getDetails();


        Book book_1 = new Book("IKIGAI", 200);
        /*
         * Parameterized Constructor
         * Here no default zero parameterized constructor is added there
         */


        /*
         * Book book_2 = new Book();
         * It is wrong because we created a parameterized constructor so default zero
         * parameterized constructor will not be created by JVM, We have to create this manually
         */
        book_1.getDetails();



Mobile mob_1 = new Mobile(); // Zero parameterized constructor
        mob_1.getDetails();
        Mobile mob_2 = new Mobile("iQOO",23250); // Parameterized Constructor
        mob_2.getDetails();
    }
}
