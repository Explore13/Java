package Topics._12_Strings.Immutable;

public class WaysToCompare
{
    public static void main(String[] args) {

        /*
        == is used to check if the variables are referring same object or not.
        equals() is used to compare the contents of two objects.
        equalsIgnoreCase() is used to compare the contents of two objects, and
        it is not case-sensitive,it ignores the cases.
         */
        /*
        String s1="PWSKILL";
        String s2=new String("PWSKILL");
        System.out.println(s1==s2); //False
        System.out.println(s1.equals(s2)); // True
         */
        /*
        String s1="PWjava";
        String s2="PWjava";
        String s3="PWJava";
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //false
        */

        /*
        String s1="PWjava";

        String s2="PWjava";
        String s3=new String("PWjava");
        String s4=new String("PWjava");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s3));
        */
        String s1="pWjava";
        String s2="PWJava";
        String s3=new String("pWjava");
        String s4=new String("PWjAva");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s3==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s4));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s2.equalsIgnoreCase(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
