package Topics._12_Strings.final_VS_immutability;

public class Final {
    public static void main(String[] args) {
        int a=10;
         a=20; // We can reassign the value
        System.out.println(a);

        final int b=10;
       // b=20; //cannot assign value to final variable b
        System.out.println(b);

    }
}
