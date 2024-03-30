package Topics._19_Interface;
interface Computer{
    void compileCode();
}
class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("No errors");
    }
}

class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("Very Fast");
    }
}
class Developer{
    //  Laptop obj = new Laptop(); Laptop is created while dev is hired, actually here Laptop obj is depended on Developer class, but it is irrelevant.
    public void buildApp(Computer obj)
    {
        //  Laptop obj = new Laptop(); If we told dev to make 2 apps then 2 times Laptop obj will be created, it is not efficient
        System.out.println("Developer is building apps");
        obj.compileCode();
    }
}
public class _3_MoreOnInterface {
    public static void main(String[] args) {
         // Laptop obj=new Laptop();
        // Desktop obj=new Desktop();
        Computer obj=new Desktop();
        Computer obj1=new Laptop();
        Developer dev=new Developer();
        dev.buildApp(obj);
        dev.buildApp(obj1);
    }
}
