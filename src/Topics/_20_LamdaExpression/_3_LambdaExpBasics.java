package Topics._20_LamdaExpression;

@FunctionalInterface
interface A {

//    void show(); If we add one method more, then it  will be normal interface, not a functional interface
    void drive(int avg,int ts); // two parameterized
}

@FunctionalInterface
interface B{
    void show(int data); // Single Parameterized
}

@FunctionalInterface
interface C{
    void display(); // Zero Parameterized
}
public class _3_LambdaExpBasics {
    public static void main(String[] args) {
        A obj1 = (avg,ts) -> System.out.println("Avg : "+avg+" and TS : "+ts);
        obj1.drive(16,140);

        B obj2 = data -> System.out.println("Data : "+data);
        obj2.show(100);

        C obj3 = () -> System.out.println("Nothing to display");
        obj3.display();
    }
}

/*
# Lambda Expression :

Def : A lambda expression is a short block of code which takes in parameters and returns a value.
Lambda expressions are similar to methods, but they do not need a name, and they can be implemented right in the body of a method.

1. To provide the implementation of Functional Interface.
2. Less Coding.

# Syntax :

(parameter-list) -> {body}

Java lambda expression is considered of 3 components.
i) Argument-list : It can be empty or non-empty as well
ii) Arrow-token : It is used to link arguments-list and body of expression
iii) Body : It contains expressions and statements for lambda expression.

**** No Parameter Syntax : ****

    () -> {
    // Body of no parameter lambda
    }

**** One Parameter Syntax : ****

        p1 -> {
        // Body of single parameter lambda
        }

**** Two Parameter Syntax : ****

        (p1,p2) -> {
        // Body of multiple parameter lambda
        }
*/