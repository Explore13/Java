package Topics.Array;

public class Initialization {
// Welcome to Explorer's JDK
    public static void main(String[] args) {
/*  num[];
num[0]=5;
num[1]=5;
num[2]=5;
num[3]=5;
num[4]=5;
Can't be initialized using this method.Local memory,
but initialize in heap .So,need to initialize the memory 1st.
*/

        int num[]=new int[5]; /* Array size is 5 and all values initialized as 0 */
        num[0]=2;
        num[1]=3;
        num[2]=6;
        num[4]=7;
        num[3]=9;
for (int i=0;i<5;i++){
    System.out.println(num[i]);
}
    }

}
