package Topics._04_Loops.Nested_Loop.Complex_Pattern;

public class CP_1 {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
    int n=10;
    for (int i=1;i<=n;i++){
        for (int j=1;j<=n;j++){
            if (i==j){
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
