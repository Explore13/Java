package MyPracticePage.Array;

/* Write a Java program to create an array of integers and initialize it with the values 10, 20, 30, 40, and 50. Print the elements of the array. */

import java.util.Scanner;

public class Initialize {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Size of Array: ");
        n=scan.nextInt();
        int arr[]=new int[n];
       /*  for (int i=0;i<arr.length;i++){
            System.out.println("Enter a number: ");
            arr[i]=scan.nextInt();
        }

        */
        for (int i:arr) {
            System.out.print(i+" ");
        }

    }
}
