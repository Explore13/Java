package MyPracticePage.staticKeyword;

class InterestCheck {
    private static final float interestRate = 4.5f;
    private final float principalAmount;
    private final int years;

//    InterestCheck() {
//        this(2000);
//        System.out.println("Default Constructor");
//        this(2000,2); //
//    }
//    InterestCheck(float principalAmount) {
//        this.principalAmount = principalAmount;
//        this.years = 1;Java doesn't allow two constructor calls inside one constructor, and not after a statement.
//    }
    InterestCheck(float principalAmount, int years) {
        this.principalAmount = principalAmount;
        this.years = years;
    }

    static void staticMethod()
    {
        System.out.println("Interest Rate : " + interestRate);
    }
    static void staticMethod(int a)
    {
        // this.staticMethod();
        staticMethod();
        // this.calculateInterest(); // can't be accessed.
        System.out.println("Interest Rate : " + interestRate);
        // this and super can not be used in static method.
    }
    float calculateInterest() {
        return this.principalAmount * this.years * interestRate;
    }
}

public class Calculator {
    public static void main(String[] args) {
        InterestCheck person_1 = new InterestCheck(1000, 1);
        System.out.println("Total Amount : "+person_1.calculateInterest());
        InterestCheck person_2 = new InterestCheck(1200, 1);
        System.out.println("Total Amount : "+person_2.calculateInterest());
    }
}
