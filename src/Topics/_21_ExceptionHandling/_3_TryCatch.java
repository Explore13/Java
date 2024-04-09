package Topics._21_ExceptionHandling;

public class _3_TryCatch {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;
        int newArray[] = {1, 2, 3, 4, 5}; // length = 5
        String str = null;


        try {
           /*
            result = num1/num2; // Arithmetic Exception
            System.out.println(result);
           */

            // System.out.println(newArray[6]); // ArrayIndexOutOfBoundsException

            result = num1 / str.length(); // NullPointerException

        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Max Value : " + newArray[(newArray.length - 1)] + " and " + e);
        } catch (Exception e) {
            System.out.println("Something went wrong..." + e);
        }


        System.out.println("Bye...");
    }
}

/*
Notes :
************ ArithmeticException **************************
1. SubClass of Exception class.
2. Can catch only Arithmetic Exception

************ ArrayIndexOutOfBoundsException ****************
1. Subclass of Exception class
2. Can catch only ArrayIndexOutOfBoundsException

************** NullPointerException *************************
1. Can catch only NullPointerException
2. Subclass of Exception class


Important :
To handle the exception properly we should add an "Exception" class type object at the end.


*/