package Topics.Strings.MoreOnMutableString;

public class Mutable {
    public static void main(String[] args) {
        /*
        StringBuffer --> Initial Capacity=16
        New Capacity=(current capacity+1)*2;

        Note: Same for StringBuilder
         */

        /*
        StringBuffer sb=new StringBuffer();
        sb.append("hehhwhwewewehwehbhjewjded");
        System.out.println(sb.capacity()); //How many character you can add
        System.out.println(sb.length());  // How many character are present
        */

        /*
        StringBuffer sb2=new StringBuffer("Surya");
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        sb2.append("GhoshExplorerapi");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        sb2.append("sd");
        System.out.println(sb2.capacity());
         */

        /*
        StringBuffer sb=new StringBuffer("Surya");
        System.out.println(sb.charAt(2)); //to check the character at the postion
        sb.setCharAt(1,'U'); // to replace the character in the position mentioned
        System.out.println(sb);
         */

        /*
        1. If we write any integar value inside the StringBuilder sb=new StringBuilder(int) then the
        capacity will be the int value.
        2. Now,If we want to change the capacity to the characters have, we use trimToSize()
        3. reverse()  is used to reverse a string
         */




        StringBuilder sb=new StringBuilder(150);
        System.out.println(sb.capacity());
        sb.append("Surya");
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.reverse());
        System.out.println(sb.replace(1,3,"hello"));
        System.out.println(sb.capacity());

    }
}
