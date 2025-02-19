package Topics._04_Loops.Nested_Loop.Pattern;

public class Pattern_4_H {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
            int n=5;
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n;j++){
                    if (i==(n+1)/2||j==1||j==n){
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
