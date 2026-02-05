package MyPracticePage.InnerClass;

class OuterClass {
    private String msg = "Hello";
    private static String msg_1 = "Hello";
    class InnerClass{
        void show()
        {
            System.out.println(msg);
        }
    }
    static class Inner{
        void display()
        {
            System.out.println(msg_1);
        }
    }
}



public class InnerClassConcept{
    public static void main(String[] args) {

        // Non Static Inner Class
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        /*
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        */
        innerClass.show();


        // Static Inner Class
//        OuterClass.Inner inner = new OuterClass().new Inner(); // Error
//        OuterClass.Inner inner = new OuterClass().Inner(); // Error
        OuterClass.Inner inner = new OuterClass.Inner();
        inner.display();

    }
}
