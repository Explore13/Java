package Topics._21_ExceptionHandling;


class MyException extends Exception {
    // Custom Exception class which is a sub class of Exception class (Not preferable)
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

public class _6_Rethrowing_Exception {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = -2;

        /*  Suppose if num2 is negative number then we have to show an error   */

        try {

            /*
                if(num2 < 0)
                {
                 System.out.println("Enter Valid Number");
                }
           */


            if (num2 < 0) {
                Exception e = new ArithmeticException("Negative Number");
                throw e; // throw new Exception(); Inline Approach
            }


            /*
                if (num2<0)
                {
                     throw new MyException("Negative Number"); // Custom Exception
                }
            */
            int result = num1 / num2;
            System.out.println("Result : " + result);
        } catch (Exception e) {
            System.out.println("Enter Valid Number : " + e);
        }
    }
}

/*
------ throw vs throws keyword -------

throw : Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.
throws : Java throws keyword is used in the method signature to declare an exception which might be thrown by the
         function while the execution of the code.

We can create an exception and can throw it using "throw" keyword. We have to make an object of Excepion
class and have to throw it.

------- Custom Exception ------------
we can create our own exceptions that are derived classes of the Exception class.
Creating our own Exception is known as custom exception or user-defined exception.
 Basically, Java custom exceptions are used to customize the exception according to user need.


*/