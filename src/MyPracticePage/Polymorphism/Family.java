package MyPracticePage.Polymorphism;


abstract class Father{

    public Father()
    {
        System.out.println("Father Constructor");
    }
    public void sleeping()
    {
        System.out.println("Father Sleeps");
    }
    public void eat()
    {
        System.out.println("Father eats");
    }
    abstract public void gaming();
}

class Son extends Father{

    int age;


    public Son(int age){
        this.age = age;
    }
    public Son()
    {
        age = 25;
    }
    @Override
    public void eat() {
        System.out.println("Son Eats");
    }

    @Override
    public void gaming() {
        System.out.println("Son plays games");
    }

    public int age(){
        return this.age;
    }
}
public class Family {
    public static void main(String[] args) {

        Father s1 = new Son();
        s1.eat();
        s1.sleeping();
        s1.gaming();
        System.out.println("Age : "+((Son)s1).age());

        /*
        Son s2 = new Father();
        s2.eat();
        s2.sleeping();
        */



    }
}
