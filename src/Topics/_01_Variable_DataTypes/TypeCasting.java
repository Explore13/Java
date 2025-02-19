package Topics._01_Variable_DataTypes;

public class TypeCasting {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
            /* Implicit TypeCasting */
            int a=45;
            double b;
            b=a;
            System.out.println(b);

            /* Explicit TypeCasting */
            double num=45.5;
            int num2;
            num2=(int) num;
            System.out.println(num2);

            /* Notes */
            int n1=12;
            int n2=5;
            float res=n1/n2;
            float val=(float)n1/n2;
            System.out.println(res+"\n"+val);
        }

}
