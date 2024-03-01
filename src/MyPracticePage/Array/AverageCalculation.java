package MyPracticePage.Array;

import java.util.Scanner;
class AvgCalc{
    public double avg(int []arr,int size){
        double sum=0;
        for (int i:arr){
            sum+=(double) i;
        }
return (sum/size);
    }
}
public class AverageCalculation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=scan.nextInt();
        int[] arr =new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the value: ");
            arr[i]=scan.nextInt();
        }
        AvgCalc obj=new AvgCalc();
        double res=obj.avg(arr,n);
        System.out.println("Average:"+res);

    }
}
