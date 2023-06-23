package Topics.Strings.Mutable;

public class Mutable_String {
    public static void main(String[] args) {
       // StringBuffer sb=""; Invalid
        StringBuffer sb=new StringBuffer("Virat");
        System.out.println(sb);
        sb.append("Kohli");
        System.out.println(sb);
    }
}
