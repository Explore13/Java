package MyPracticePage.Array;

public class PlayWith2DArray {

    public static void main(String[] args) {
        int m = 3, n = 4;
        int[][] arr = new int[m][n];
//
//        int data = 100;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i % 2 == 0 && j % 2 == 0)
//                    arr[i][j] = 0;
//                else {
//                    arr[i][j] = data;
//                    data += 100;
//                }
//            }
//        }

//        int data = 100;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                if(j == 0) arr[i][j] = data;
//                else if(j==1) {
//                    data = arr[i][j-1]+100;
//                    arr[i][j] = data;
//                }
//                else {
//                    data = arr[i][j-2] + arr[i][j-1];
//                    arr[i][j] = data;
//                }
//            }
//        }


        int data = 10, top = 0, right = n-1, left = 0, bottom = m-1;

        while (top<=bottom && left<=right)
        {
            if(top == 0 && left == 0)
            {
                for (int i = 0; i < n; i++) {
                    left++;
                    arr[top][i] = data;
                    data += 10;
                }
            }

            else if(left == right)
            {
                for (int i = top; i <= bottom; i++) {
                    top++;
                    arr[i][left] = data;
                    data+=10;
                }
            }
            else if (top == bottom && left == right) {
                for (int i = right; i >=0 ; i--) {
                    left--;
                    arr[top][i] = data;
                    data+=10;
                }
            }

            else if (left == 0 && top == bottom)
            {
                for (int i = top; i>0; i--)
                {
                    top--;
                    arr[i][left] = data;
                    data+=10;
                }
            }

            else{

            }


        }


//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }

        for (int[] a : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
