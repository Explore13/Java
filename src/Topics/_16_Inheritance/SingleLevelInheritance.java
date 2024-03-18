package Topics._16_Inheritance;
class Animal{
    void sleep(){
        System.out.println("Animal need sleep");
    }
}
class Tiger extends Animal
{

}
public class SingleLevelInheritance {
    public static void main(String[] args) {
    Tiger t=new Tiger();
    t.sleep();
    }
}
