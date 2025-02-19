package Topics._04_Loops.Nested_Loop.Pattern;

public class Pattern_3 {
    // Welcome to Explorer's JDK
    public static void main(String[] args) {
      /*  int n=4;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==0||j==0||i==(n-1)/2||j==n-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        } */
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1||j==1||i==(n+1)/2||j==n){
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
