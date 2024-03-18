package MyPracticePage.staticKeyword;

public class staticBlockVSnonStaticBlock {
    static int age;

    static {
        System.out.println("Static Block");
        age = 20;
    }

    static void display()
    {
        System.out.println("Static Method");
        System.out.println(age);
    }
    public static void main(String[] args) {

        System.out.println("Main Method");
        display();
    }
}
