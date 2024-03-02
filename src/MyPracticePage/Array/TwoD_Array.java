package MyPracticePage.Array;
import java.util.Scanner;

class avgCalculator {
    public double avgValue(int [][]arr,int length) {
        double total = 0;
        for (int[] a : arr) {
            for (int b : a) {
                total += (double) b;
            }
        }
        return total/length;
    }
}
public class TwoD_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the row and col of array : ");
        m = scan.nextInt();
        n = scan.nextInt();

        int [][] arr = new int[m][n];

        System.out.println("Enter the data : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=scan.nextInt();
            }
        }

        avgCalculator obj = new avgCalculator();
        double avg = obj.avgValue(arr,(m*n));
        System.out.println("Average of the Array : "+avg);
    }
}
