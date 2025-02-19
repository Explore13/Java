package Topics._04_Loops.Nested_Loop.Complex_Pattern;

public class CP_7 {
    // Welcome to Explorer's JDK
    public static void main(String[] args) {
        int n=21;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==j||i+j==n+1||(i+j==(n/2)+2)||i==1||j==1||i==n||j==n||(i-j==n/2)||(j-i==n/2)){
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
