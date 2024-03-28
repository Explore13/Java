package MyPracticePage.Loops.Qustions;

import java.util.Scanner;

public class AtoZ {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char ch='a';
        while(ch<='z'){
            System.out.println(ch);
            ch++;
        }
    }
}
