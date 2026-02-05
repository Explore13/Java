package Topics._15_Constructor;

class BioData {
    private String name;
    private int age;

    BioData() {
        this("Surya", 19);
        System.out.println("Zero parameterized constructor");
        this.name = "Ani";
    }

    /*
    NOTE :  Call to 'this()' must be first statement in constructor body

    BioData() {
        System.out.println("Zero parameterized constructor");
        this("Surya", 19); // Compile time Error
    }
    */

    BioData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    BioData(int age) {
        this();
        System.out.println("Single Parameterized Constructor");
        this.age = age;
    }

    public void display() {
        System.out.println("Biodata : " + this.name + " " + this.age);
    }
}

public class Checking {

    public static void main(String[] args) {
        BioData s1 = new BioData();
        BioData s2 = new BioData(18);
        BioData s3 = new BioData("Anu", 17);
        s1.display();
        s2.display();
        s3.display();
    }
}
