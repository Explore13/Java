package MyPracticePage.Array;

import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
        // Diff columns number for diff rows : Jagged Array
        Scanner scan = new Scanner(System.in);
        int row;
        System.out.println("Enter the number of rows : ");
        row = scan.nextInt();
        int [][]arr = new int[row][];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter columns for Row number : "+i+" >> ");
            int col = scan.nextInt();
            arr[i] = new int[col];
        }

        for (int i = 0; i < row; i++) {
            System.out.println("Enter data for row : "+i +" : ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i[]:arr) {
            for(int j:i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
