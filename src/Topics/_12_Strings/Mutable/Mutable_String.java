package Topics._12_Strings.Mutable;

public class Mutable_String {
    public static void main(String[] args) {
       // StringBuffer sb=""; Invalid
        StringBuffer sb=new StringBuffer("Virat");
        System.out.println(sb);
        sb.append("Kohli");
        System.out.println(sb);
        /*
        1. To concatenate two mutable strings we used append()
        2. We do not need to refer the object after appending,
        it's automatically done.
        sb=sb.append("kohli"); ---> Wrong but it will run
        sb.append("kohli"); ---> Right
        3. Changes happened in the main string. No new string will be created.
         */
    }
}
