package MyPracticePage.Array;
/* Write a Java program to create an array of integers and calculate the sum of all the elements in the array. */

import java.util.Scanner;

class ArraySum{
    public int add(int arr[]){
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        return sum;
    }
}
public class Sum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArraySum obj=new ArraySum();
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter values of array: ");
            arr[i]=scan.nextInt();
        }
        int res=obj.add(arr);
        System.out.println("The Sum="+res);
    }
}
