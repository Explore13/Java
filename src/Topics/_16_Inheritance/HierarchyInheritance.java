package Topics._16_Inheritance;
class Animals
{
    void sleep(){
        System.out.println("They need sleep");
    }
}
class Tiger_1 extends Animals{

}
class Monkey extends Animals{

}
class Deer extends  Animals{

}
public class HierarchyInheritance {
    public static void main(String[] args) {
        Tiger_1 t=new Tiger_1();
        Monkey m=new Monkey();
        Deer d=new Deer();
        t.sleep();
        m.sleep();
        d.sleep();
    }
}
