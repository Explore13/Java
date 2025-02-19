package Topics._09_Jagged_Arrays;

public class Value_Assign {
    public static void main(String[] args) {
        int [][]arr=new int[5][];
        arr[0]=new int[5];
        arr[1]=new int[3];
        arr[2]=new int[1];
        arr[3]=new int[4];
        arr[4]=new int[2];

        /* Row-0 */
        arr[0][0]=6;
        arr[0][1]=1;
        arr[0][2]=9;
        arr[0][3]=7;
        //arr[0][4]=6;

        /* Row-1  */
        arr[1][0]=2;
        arr[1][1]=4;
        arr[1][2]=5;

        /* Row-2 */
        arr[2][0]=7;

        /* Row-3 */
        arr[3][0]=5;
        arr[3][1]=7;
        arr[3][2]=9;
        arr[3][3]=3;

        /* Row-4 */
        arr[4][0]=8;
        arr[4][1]=3;

        for (int i=0;i<5;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
