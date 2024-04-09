package Topics._21_ExceptionHandling;

import java.util.Scanner;

public class _4_TryWithResources {
    public static void main(String[] args) {
        int num = 0;

        /*
         Scanner sc = new Scanner(System.in);
         try{
            num = sc.nextInt();
            // sc.close();
        }catch (Exception e)
        {
            System.out.println("Exception : " + e);
            // sc.close();
        } finally {
            sc.close();
            System.out.println("Scanner class closed...");
        }
        */


        /************ Try-with-resources *****************/

        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        System.out.println("The input : " + num);
    }
}

/*
**** sc.close(); ----> to prevent the input device from sending inputs to the program when not required.
**** We have to close the Scanner class after using it. It may be after try or catch block.
**** We can use "finally" block to execute the lines of code after try or catch

* Without try block "catch" and "finally" will not work
* But without "catch" or "finally" , try block will work

### A "finally" block is a block of code that is executed after the try and catch blocks,
    regardless of whether an exception is thrown.This makes it ideal for cleaning up resources,
    such as closing files or database connections.

************ Try-with-resources ******************

* In Java, the try-with-resources statement is a try statement that declares one or more resources.
* The resource is as an object that must be closed after finishing the program. The try-with-resources
  statement ensures that each resource is closed at the end of the statement execution.
* You can pass any object that implements java.lang.AutoCloseable, which includes all objects which implement "java.io.Closeable".

*/