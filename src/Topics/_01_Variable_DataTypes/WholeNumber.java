package Topics._01_Variable_DataTypes;

 public class WholeNumber {
// Welcome to Explorer's JDK
    public static void main(String[] args) {
        byte a=5;
        //Range for the byte : -128 to 127

        /*
        int data=4555;
        Range for the int: -2147485648 to 2147485647
         */

        /*
        long data= 2147485648;
        Generally there is not prblm not using L or l after value
        in long datatype..But when we exceed the range of integar
        then it shows error because without L or l it represents
        int...
        long data=2147485648L;
      */
        byte b=19;
        /*
          byte data=a+b;
          For expression byte does not work.
          byte data=a+b; is a wrong expression.We should use:
          int data=a+b;
         */
        long data=a+b;
        System.out.println(data);
    }
}
