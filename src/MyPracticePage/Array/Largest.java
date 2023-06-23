package MyPracticePage.Array;
import java.util.Scanner;
class Calc{
    public int large(int arr[]){
        int val=0;
     for (int i:arr){
         if (i>val){
             val=i;
         }
     }
       return val;
    }
}
public class Largest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            arr[i]=scan.nextInt();
        }
        Calc obj=new Calc();
        int res=obj.large(arr);
        System.out.println("Largest: "+res);
    }
}
