package Topics.Loops.Nested_Loop.Complex_Pattern;

public class CP_14 {
    // Welcome to Explorer's JDK
    public static void main(String[] args) {
        int n=21;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ((i==1&&j<=(n+1)/2)||(i+j<=((n+1)/2)+1)||(j==1&&i<=(n+1)/2)||
                        (i==1&&j>=(n+1)/2)||(j==n&&i<=(n+1)/2)||(j-i>=n/2)||
                        (j==1&&i>=(n+1)/2)||(i==n&&j<=(n+1)/2)||(i-j>=n/2)||
                        (j==n&&i>(n+1)/2)||(i==n&&j>=(n+1)/2)||(i+j>=(n+(n+1)/2))){
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
