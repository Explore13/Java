package MyPracticePage.IfElse;

import java.util.Scanner;

public class alphabetCheck {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=scan.next().charAt(0);
       if (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
           System.out.println(ch+" is an Alphabet");
       }
       else {
           System.out.println(ch+" is not an Alphabet");
       }
    }
}
