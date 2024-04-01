package Topics._20_LamdaExpression;

class Outer {
    public void show()
    {
        System.out.println("Outer Class Show");
    }
    class Inner {
        public void display(){
            System.out.println("Display from Inner Class");
        }
    }

   static class Inner_2{
        public void display_2()
        {
            System.out.println("Display from Inner_2,static class");
        }
    }
}

public class _1_InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        // Inner obj1 = new Inner(); Can not get the Inner class for reference and can not make the object

        /*
        show() is a method which is a member of outer class,
        similarly Inner class is also a member of outer class.

        To call show(), we need the reference and object of outer class
        Similarly, we need the reference of outer class and object of outer
        class to create the inner object and make reference
        */

        Outer.Inner obj1 = new Outer().new Inner(); // Outer.Inner obj1 = obj.new Inner();
        obj1.display();


//        Outer.Inner_2 obj2 = obj.new Inner_2(); We have to use classname to create  the object because Inner_2 is a static class

        Outer.Inner_2 obj2 = new Outer.Inner_2();
        obj2.display_2();
    }
}

/*
Inner class : In Java, inner class refers to the class that is declared inside class or interface which were mainly introduced,
to sum up, same logically relatable classes as Java is purely object-oriented so bringing it closer to the real world

Inner class is 3 types.
i) Member
ii) Static
iii) Anonymous

Note : static keyword can be used only in Inner Class
*/
