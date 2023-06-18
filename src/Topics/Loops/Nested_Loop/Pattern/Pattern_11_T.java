package Topics.Loops.Nested_Loop.Pattern;

public class Pattern_11_T {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
            int n=4;
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n;j++){
                    if (i==1||j==(n+1)/2){
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
