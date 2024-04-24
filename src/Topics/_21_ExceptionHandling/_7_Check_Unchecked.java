package Topics._21_ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InvalidObjectException;

public class _7_Check_Unchecked {
    public static void main(String[] args) {
        int result = 7/0; // Unchecked Exception
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str = br.readLine(); // Checked Exception ( Unhandled exception: java.io.IOException )

        // Handle the Checked Exception
        try{
            String str = br.readLine();
            System.out.println("Str : "+str);
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*
--------------------------- Checked vs Unchecked Exception ---------------------------------

# Unchecked Exception : Unchecked exceptions are exceptions that are not checked at compile-time;
                        hence, the compiler does not force you to handle them explicitly. They
                        usually occur at runtime and are subclasses of RuntimeException or Error.

# Checked Exception : Checked exceptions are exceptions that are checked at compile-time by the compiler.
                      Any method that might throw a checked exception must declare it in its method signature
                      using the throws keyword, or handle it using a try-catch block.


Note :
1. Compiler will not force to handle the unchecked exception
2. Compiler will force to handle the checked exception

# Unchecked : RuntimeException etc
# Checked : IOException, SQLException etc
*/