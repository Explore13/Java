package Topics._4_Loops.Nested_Loop.Pattern;

public class Pattern_8 {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
             int n=5;
           /* for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    if ((i==0&&j>0&&j<(n-1)/2)||(j==0&&i>0)||(i==(n-1)/2&&j<=(n-1)/2)||(j==(n-1)/2&&i>0)){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            } */

            for (int i=1;i<=n;i++){
                for (int j=1;j<=n;j++){
                    if ((i==1&&j>1&&j<(n+1)/2)||(j==1&&i>1)||(i==(n+1)/2&&j<=(n+1)/2)||(j==(n+1)/2&&i>1)){

                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

}
