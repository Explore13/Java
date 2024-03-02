package Topics._12_Strings.final_VS_immutability;

public class Immutability {
    public static void main(String[] args) {

        /*
        StringBuffer sb= new StringBuffer("Virat");
        System.out.println(sb); //Virat
        sb=sb.append("Kohli");
        System.out.println(sb); //ViratKohli
        sb=new StringBuffer("Sachin");
        System.out.println(sb); //Sachin

        At first, sb refers to Virat,then We added Kohli into it. Changes occurred in the same
        object. Now we create a new object named Sachin. Then we referred it by sb. Now the value of sb is Sachin.
         */

        final StringBuffer sb= new StringBuffer("Virat");
        System.out.println(sb);
        sb.append("Kohli");
        System.out.println(sb);
        //sb= new StringBuffer("Sachin");// Cannot assign a value to final variable 'sb'


        /*
        String s=new String("Virat");
        System.out.println(s);
        s=s.concat("Kohli");
        System.out.println(s);
        s=new String("Sachin");
        System.out.println(s);
        */

       /*
        final  String s=new String("Virat");
        System.out.println(s);
        s=s.concat("Kohli");
        System.out.println(s);
        */
    }
}
