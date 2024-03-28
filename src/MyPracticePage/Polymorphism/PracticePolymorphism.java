package MyPracticePage.Polymorphism;

class Parent {
    public void display() {
        System.out.println("Inside the Parent Class");
    }
}

class Child_1 extends Parent {

    @Override
    public void display() {
        System.out.println("Inside the Child_1 Class");

    }
}

class Child_2 extends Parent {
    @Override
    public void display() {
        System.out.println("Inside the Child_2 Class");

    }
}
public class PracticePolymorphism {
    public static void main(String[] args) {
//        Child_1 ch = new Child_1();
//        ch.display();
//        /*
//        Reference Type : Child_1
//        Object Type : Child_1
//         */
//
//        Child_2 ch2 = new Child_2();
//        ch2.display();

        Parent child = new Child_1(); // Reference : Parent Type, Object : Child_1 Type
        child.display();
        child = new Child_2();
        child.display();

        /*
        Note: Parent type reference can refer subclass type objects

        Polymorphism: Poly - Many, Morphism - Behaviour
        Static/ Compiled Time Polymorphism: Method Overloading
        Dynamic/ Runtime Polymorphism: Method Overriding
        Super Class reference can refer to the SubClass Objects

        To achieve polymorphism, we have to create Parent Class reference for Child Class.
        */
    }
}