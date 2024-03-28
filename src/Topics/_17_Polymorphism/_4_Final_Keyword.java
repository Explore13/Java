package Topics._17_Polymorphism;

/*
final class Animal {
     void sleep(){
        System.out.println("Animal needs Sleep");
    }
}

When we make it final,an error will be pop up in the Tiger class.
Because we can not inherit a class which is already final.
 */
class Animal {
    int age=3;
    final int x=34;

     final void sleep(){
         age=45; //We can change a variable value which is not final
        // x=56; we cannot change value of a final variable
        System.out.println("Animal needs Sleep");
    }
}
class Tiger extends Animal
{
/*
void sleep(){
    System.out.println("Hey");
}
We cannot override a final method in child class. But final method
will be inherited.
 */
}
public class _4_Final_Keyword {
    public static void main(String[] args) {
        Tiger tg=new Tiger();
        tg.sleep();
    }
} 
