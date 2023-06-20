package Knowledge;


/*
           length vs length()
length: It is a property of array type class.
length(): It is a method of String Class.
 */

    public class length_vs_length_bracket {
    public static void main(String[] args) {

        /*---------length-------- */
         int num[]={1,2,3,4,5};
        System.out.println("1-D Array: "+ num.length);

        int nums[][]={
                {1,2,3,4},
                {5,6,7,4},
                {1,9,3,6},
        };
        System.out.println("2-D Array Length: "+nums.length);
        System.out.println("2-D Array Row Length: "+ nums[0].length);


        /*--------length()--------*/
        String name="Surya";
        /* String is a class not a primitive datatype
        Class has the method.
         */
        System.out.println("String Length: "+name.length());
    }
}
