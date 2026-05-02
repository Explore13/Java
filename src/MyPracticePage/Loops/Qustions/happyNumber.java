package MyPracticePage.Loops.Qustions;

import java.util.*;
public class happyNumber {
        private static boolean calcHappyNumber(int n){
            while(n>=10){
                int num = n, sum = 0;
                while(num > 0){
                    int temp = num % 10;
                    sum+=(int)Math.pow(temp,2);
                    num/=10;
                }
                System.out.println("Sum : "+sum);
                n = sum;
            }

            return n == 1;
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        if(calcHappyNumber(n)) System.out.println(n + " is a happy number.");
        System.out.println(n + " is not a happy number");
    }
}
