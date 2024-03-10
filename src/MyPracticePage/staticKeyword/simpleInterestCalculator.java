package MyPracticePage.staticKeyword;

import java.util.Scanner;

class Interest {
    int principleAmount;
    float timeDuration;

    static float interestRate;

    float simpleInterest = 0;

    static {
        interestRate = 4.5f;
    }
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Primary Amount : ");
        principleAmount = scan.nextInt();
        System.out.println("Enter Time Duration : ");
        timeDuration = scan.nextFloat();
    }


   /*
    public Interest(int principleAmount, float timeDuration, float interestRate) {
        this.principleAmount = principleAmount;
        this.interestRate = interestRate;
        this.timeDuration = timeDuration;
    }
    */


    public void calculateInterest() {
        simpleInterest = (principleAmount * timeDuration * interestRate) / 100f;
    }


    public float getSimpleInterest() {
        return simpleInterest;
    }

    public float getTotalAmount() {
        return principleAmount+simpleInterest;
    }
}


public class simpleInterestCalculator {
    public static void main(String[] args) {

        Interest f1 = new Interest();
        f1.input();
        f1.calculateInterest();
        System.out.println("Simple Interest : "+f1.getSimpleInterest());
        System.out.println("Total Amount : "+f1.getTotalAmount());

        Interest f2 = new Interest();
        f2.input();
        f2.calculateInterest();
        System.out.println("Simple Interest : "+f2.getSimpleInterest());
        System.out.println("Total Amount : "+f2.getTotalAmount());
    }
}
