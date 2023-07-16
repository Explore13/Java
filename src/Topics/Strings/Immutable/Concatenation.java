package Topics.Strings.Immutable;

public class Concatenation {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
    /*
    String Concatenation may be done by Two Process:
    1. + Operator
    2. String.concat() method
     */

            String str = new String("PW");
            str.concat("Skills");
            System.out.println(str);
            /*
            String is used to create Immutable String. We can't change its value using .concat()
            For str,it refers to "PW" in Heap Memory(outside the SCP),when we change its value,a new
            string will be allocated in heap. But str refers "PW"...

            In str2,we concat and reinitialize str2. So that str2 refers Surya Ghosh..
             */

            String str2 = new String("Surya ");
            str2 = str2.concat("Ghosh");
            System.out.println(str2);


            /*--------Concatenation Using .concat() Method---------*/
          /*
            String s1 = "PW";
            String s2 = s1.concat("Skill"); //We used inbuilt method and reference,it will be created outside the SCP. "
            String s3 = new String("PW");
            s3 = s3.concat("Skill");

            System.out.println(s1); //PW
            System.out.println(s2); //PWSkill
            System.out.println(s3); //PWSkill
           */


            /*----------Concatenation Using + Operator----------*/

            /*
            String s1="PW";
            String s2="PW"+"Skill";
            String s3="PW"+"Skill"+"New";
            String s4=s1+s2;
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
             */

        /* You can add numbers via + operator but .concat() can not */

       String s="PW"+100+99;
            System.out.println(s);

            /* String string_1="PW";
            string_1=string_1.concat("100");
            System.out.println(string_1);

             */

            String str_1="pw";
            String str_2=str_1.concat("skill");
            String str_3=str_1.concat("100")+str_2;
            String str_4=str_3.concat(str_1+str_2);
            System.out.println(str_1);
            System.out.println(str_2);
            System.out.println(str_3);
            System.out.println(str_4);

        }
}
