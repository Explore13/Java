package Topics.Loops.Nested_Loop.Pattern;

public class Pattern_10_L {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
            int n=5;
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n;j++){
                    if (j==1||i==n){
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
