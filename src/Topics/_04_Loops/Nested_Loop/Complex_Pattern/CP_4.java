package Topics._04_Loops.Nested_Loop.Complex_Pattern;

public class CP_4 {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
            int n=11;
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n;j++){
                    if (i==j||i+j==n+1||i+j==(n+1)/2){
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
