package Topics._23_Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class _1_hashing {
    public static int hashFunction(int[] arr, int num)
    {
        int max = Arrays.stream(arr).max().getAsInt();

        // precompute
        int hash[] = new int[max+1];
        for(int i = 0;i<arr.length;i++)
        {
            hash[arr[i]] +=1;
        }

        // fetching
        return hash[num];
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++)
        {
            System.out.printf("Enter the value of %d index : ",i);
            arr[i] = sc.nextInt();
        }

        System.out.print("\n Enter the number you wanna search : ");
        int num = sc.nextInt();
        int freq = hashFunction(arr,num);
        System.out.printf("%n%d is found %d times",num,freq);
        sc.close();
    }
}
