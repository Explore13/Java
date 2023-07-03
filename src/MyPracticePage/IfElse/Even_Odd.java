package MyPracticePage.IfElse;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=scan.nextInt();
        if (n%2==0){
            System.out.println(n+" is an Even Number");
        }
        else {
            System.out.println(n+" is an Odd Number");
        }
    }
}
