package MyPracticePage.Inheritance;

import java.util.Scanner;
class HumanClass{
    private String name;
    int age;

    public HumanClass(String name,int age)
    {
        this.name = name;
        this.age = age;

        System.out.println("Parameterized Constructor in Human Class");
    }

    public HumanClass()
    {
        name = "John De";
        age = 40;
        System.out.println("Zero Parameterized Constructor in Human Class");
    }

    public HumanClass(String name)
    {
        this();
        this.name = name;
        System.out.println("Only name is initialized");
    }

    public HumanClass(int age)
    {
        this();
        this.age = age;
        System.out.println("Only age is initialized");
    }

    public void personDetails(int id)
    {
        System.out.printf("\nPerson_%d Details : %s and %d",id,name,age);
    }
}


class ChildClass extends HumanClass
{
   int intelligence;

    public ChildClass(String name,int age,int intelligence)
    {
        super(name,age);
        this.intelligence = intelligence;
    }
    public ChildClass(int intelligence)
    {
        this.intelligence = intelligence;
    }

    public ChildClass(String name,int intelligence)
    {
        super(name);
        this.intelligence = intelligence;
    }

    public ChildClass(int age,int intelligence)
    {
        super(age);
        this.intelligence = intelligence;
    }

    public void getIntelligence(int id)
    {
        super.personDetails(id);
        System.out.println("\nIntelligence : "+intelligence+"\n");
    }
}

public class ConstructorExecution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 1;
        ChildClass anupam = new ChildClass(90);
        anupam.getIntelligence(count++);

        ChildClass surya = new ChildClass("Surya",20,80);
        surya.getIntelligence(count++);


        ChildClass ani = new ChildClass("Ani",70);
        ani.getIntelligence(count++);


        ChildClass dada = new ChildClass(27,100);
        dada.getIntelligence(count++);
    }
}