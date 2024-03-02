package Topics._10_Enhance_For_Loop;

public class Enhanced_2D {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {4,3,7,9},
        };
        for (int a[]:arr){
            for (int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
