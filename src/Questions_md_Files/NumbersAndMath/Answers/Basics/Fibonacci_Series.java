package Questions_md_Files.NumbersAndMath.Answers.Basics;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a range : ");
        int range = scan.nextInt();

        if (range < 0) System.out.println("Invalid Number");
        else {
            if(range == 0) System.out.println(0);
            else if (range == 1) System.out.println(1);
            else {
                System.out.print("0, 1");
                int last = 1, prev = 0, current = 0;
                for(int i = 2; i <= range ; i++) {
                    current = prev + last;
                    prev = last;
                    last = current;
                    System.out.print(", " + current);
                }
            }
        }
    }
}
