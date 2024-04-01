package Topics._21_ExceptionHandling;

public class _2_Exception_Handle {
    public static void main(String[] args) {

        int num1 = 6;
        // int num2 = 0; // De-comment it to see the exception and comment the next line
        int num2 = 2;

        try {
            int result = num1 / num2; // If try block throws an exception then it is caught by catch block.
            System.out.println("Result : " + result);
        } catch (Exception exp) { // "Exception" class,  exception thrown by try block is an object
            System.out.println("Something went wrong : " + exp.getMessage());
        }

        System.out.println("Program Ended...");

    }
}
/*
Exception : Runtime Error
*/