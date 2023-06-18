package Topics.Loops.Nested_Loop.Pattern;

public class Pattern_2 {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
           /* int n=4;
    for (int i=1;i<=n;i++){
        for (int col=1;col<=n;col++){
            if (i==1||i==n){
                System.out.print("* ");
            }
            else {
                System.out.print("* ");
                for (int space=1;space<=n-2;space++){
                    System.out.print("  ");
                }
                System.out.print("*  ");
                break;

            }
        }
        System.out.println();
    } */
            int n=5;
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n;j++){
                    if (i==1||j==1||i==n||j==n){
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
