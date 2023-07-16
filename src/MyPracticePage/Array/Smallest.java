package MyPracticePage.Array;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int small=arr[0];
        for (int i=0;i<arr.length;i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        System.out.println("Smallest : "+small);
    }
}
