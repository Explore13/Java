package Knowledge;

public class ArrayIndexOutofBoundException {
    public static void main(String[] args) {
       int arr[]={10,20,30,40};
       /* System.out.println(arr[3]);
        System.out.println("Bye");

        Output:
        3
        Bye
        */

        /*
        System.out.println(arr[4]);
        System.out.println("Bye");

        Output:
        ArrayIndexOutofBoundException
         */

        /*-----To avoid this problem */

        /*
                    Method:1

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
         */

        /*
           Method:2

       for(int i:arr){
       System.out.print(i+" ");
       }
          */

        }
    }

