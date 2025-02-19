package Topics._09_Jagged_Arrays;

public class What {
    public static void main(String[] args) {
        /*
        Jagged Arrays:
           Jagged Arrays means the Row Number will be same but
           the col numbers in every row will be different..

          ex:
           1 2 3 4
           2 5
           9 4 6

         */
        int arr[][]={
                {1,2,3,4},
                {1,2,4},
                {4,5},
        };
        /*
        It will produce an error.We can't print the jagged array
        using this method.
         */
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
