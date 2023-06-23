package Topics.Strings.Immutable;

public class Immutable_String {
    public static void main(String[] args) {
        /*
        SCP-String Constant Pool-> Inside the heap memory
        there is a special memory block which is especially for
        storing Strings Only.


        String var="value";
        Memory is created at String Constant Pool inside the Heap Memory.

        String name =new String("Surya");
        Memory is also created inside the Heap and outside the SCP.

        Note:
        We can't create duplicate object inside the SCP.
        String var="variable";
        String var2="Variable";
        Both are created inside the SCP and refers the same object.

        String name=new String("Surya");
        String name2=new String("Surya");
        Both are also created outside the SCP. And both are
        referring two diff objects.

        Note: One copy of the value which is created outside the
        SCP also stored in SCP,which is not referred by anyone.

        Imp Note: Garbage Collector does not collect values from SCP.
         */
      /*
       String var1="Pw";
        System.out.println(var1);
        String var2=new String("PW");
        System.out.println(var2);
         */
        String s1="PW";
        String s2="PW";
        System.out.println(s1==s2);

        String s3=new String("Surya");
        String s4=new String("Surya");
        System.out.println(s3==s4);

    }
}
