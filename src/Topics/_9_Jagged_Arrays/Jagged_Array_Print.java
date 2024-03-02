package Topics._9_Jagged_Arrays;

public class Jagged_Array_Print {
    public static void main(String[] args) {
        int num[][]={
                {1,2,3,4},
                {2,5},
                {6,4,2},
        };
        /*
        Here we use .length to check the length of every row.

        num[row].length

         */
        for (int i=0;i<3;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
