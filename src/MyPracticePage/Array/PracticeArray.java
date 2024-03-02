package MyPracticePage.Array;

import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n;
        n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the data : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("The Array : ");
        for (int j : arr) {

            System.out.print(j + " ");

        }
    }
}
