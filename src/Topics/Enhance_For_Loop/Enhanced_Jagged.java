package Topics.Enhance_For_Loop;

public class Enhanced_Jagged {
    public static void main(String[] args) {
        int num[][]=new int[3][];
        num[0]=new int[4];
        num[1]=new int[2];
        num[2]=new int[3];

        /*---------0th Row--------- */
        num[0][0]=4;
        num[0][1]=6;
        num[0][2]=8;
        num[0][3]=2;

        /*----------1st Row---------- */
        num[1][0]=1;
        num[1][1]=6;

        /*-----------2nd Row---------- */
        num[2][0]=3;
        num[2][1]=8;
        num[2][2]=5;

        /*----------Print using enhanced for loop-----------*/

        /*
        Outer loop will give the every element of num array.
        0th element: cmplt 0th row of the num.
        1st element: cmplt 1st row of the num.
        2nd element: cmplt 2nd row of the sum

        We store every cmplt row (every element of the num) in a[] because the elements
        are in array form.
        Then storing each element of each array in b and print it.
         */

        for (int a[]:num)
    {
        for (int b:a)
        {
            System.out.print(b+" ");
        }
        System.out.println();
    }
    }
}
