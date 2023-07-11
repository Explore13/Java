package Topics.Interface;
class Computer {
    public void compileCode()
    {

    }
}
class Laptop extends Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors");
    }
}

class Desktop extends Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors, faster");
    }
}
class Developer
{
    public void buildApp(Computer obj){
        System.out.println("Building App");
        obj.compileCode();
       /*
       Laptop obj=new Laptop();
        obj.compileCode();

        In this method we can see when we call dev.buildApp()
        for second time,obj will create once more. In real life
        a developer we not get new laptop for a new project.
        */
    }
}
public class _3_MoreOnInterface {
    public static void main(String[] args) {
         // Laptop obj=new Laptop();
        // Desktop obj=new Desktop();
        Computer obj=new Desktop();
        Developer dev=new Developer();
        dev.buildApp(obj);
        dev.buildApp(obj);
    }
}
