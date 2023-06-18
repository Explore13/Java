package Topics.Conditionals;



public class Ternary {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
    int a=4,b=6,c=5;
            //System.out.println((a<b)?"a is less than b":"b is less than a");
        String value=(a<b)?((a>c)?"a is less than b and greater than c":"a is less than b and c"):"a is greater than b";
       System.out.println(value);
        }

}
