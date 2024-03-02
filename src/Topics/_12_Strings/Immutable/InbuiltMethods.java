package Topics._12_Strings.Immutable;

public class InbuiltMethods {
    public static void main(String[] args) {
        String str="Surya Ghosh";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        //int length=str.length();
        System.out.println(str.substring(1,3));
        System.out.println(str.indexOf("h"));
        System.out.println(str.lastIndexOf("h"));

    }
}
