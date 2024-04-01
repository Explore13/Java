package Topics._21_ExceptionHandling;

public class _1_DifferentTypes {
    public static void main(String[] args) {

        /*
         * system.out.println(); ---> Syntax Error
         * System,out.printn(); ----> Syntax Error

         * One can easily solve the syntax error and IDE will show you.
         * Client will not get the issue

         */


        /*---------- Logical Error ---------- */
        int num1 = 6;
        int num2 = 5;

        int result = num1 - num2;
        /*
         * No syntax problem
         * We will get the Output but wrong output
         * Like here, we should get 11, but we get 1 because we made the logical error
         * Client will also get the error but can't identify the problem
         */
        System.out.println("Addition is : " + result);


        /*---------- Runtime Error ---------- */

        int a = 6;
        int b = 2;
        /*
        int b = 0;

        We will get the following error and program will be stopped, Bye... will not be executed.
        Application will be closed if the application faced any runtime error.

        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at Topics._21_ExceptionHandling._1_DifferentTypes.main(_1_DifferentTypes.java:38)

        To handle it we have to read about exception handling.
        */

        int res = a / b;
        System.out.println("Answer : " + res);
        System.out.println("Bye...");

    }
}

/*
**** Different Types of Errors ****
1. Syntax Error
2. Logical Error
3. Runtime Error
*/
