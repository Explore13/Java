package Topics._21_ExceptionHandling;

class  Demo
{
    public void a() throws  Exception
    {
        b();
    }
    public void b() throws Exception
    {
        int num1=8;
        int num2=0;
        int result = num1/num2;
        System.out.println("Result : "+result);
    }
}
public class _5_Handling_Ducking {
    public static void main(String[] args) // throws Exception ---> Not a good practice
    {

        Demo obj=new Demo();
        try{
            obj.a();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}


/*
-------------Handling vs Ducking---------------------

1. Handling an exception ---> Exception Handing
2. Avoid handling an exception in the current method
 by propagating it to the calling method -----> Ducking

Example :
1.
public void myMethod() throws Exception {
  // ...
}

Note : Do not write throws Exception after main method,
because the exception will send to JVM, which is not a good practice.
so, handle the exception in main method at last.
*/