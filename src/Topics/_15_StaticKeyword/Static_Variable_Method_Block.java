/* package Topics.StaticKeyword;

import java.util.Scanner;


class Farmer{
    int pa;
    float td;
    float ri;
    float si;

    void input(){
       Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the Amount: ");
        pa=scan.nextInt();
        System.out.println("Please Enter the Time Duration: ");
        td=scan.nextFloat();
        ri=4.5f;
    }

    void compute(){
        si=(pa*td*ri)/100f;
    }
    void display(){
        System.out.println("Simple Interest is: "+si);
    }
}
public class Static_Variable_Method_Block {
    public static void main(String[] args) {
        Farmer f1=new Farmer();
        Farmer f2=new Farmer();
        f1.input();
        f1.compute();
        f1.display();

        f2.input();
        f2.compute();
        f2.display();

    }
}

 */

package Topics._15_StaticKeyword;

import java.util.Scanner;

class Farmer{
    int pa;
    float td;
    static float ri;
    float si;
    static {
        ri=4.5f;
    }
    void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the Amount: ");
        pa=scan.nextInt();
        System.out.println("Please Enter the Time Duration: ");
        td=scan.nextFloat();

    }

    void compute(){
        si=(pa*td*ri)/100f;
    }
    void display(){
        System.out.println("Simple Interest is: "+si);
    }
}
public class Static_Variable_Method_Block {
    public static void main(String[] args) {
        Farmer f1=new Farmer();
        Farmer f2=new Farmer();
        f1.input();
        f1.compute();
        f1.display();

        f2.input();
        f2.compute();
        f2.display();

    }
}

/*
Previous code not memory efficient because ri will be created everytime when a new object will be created. But the
value of ri is same throughout every object. So we can make the ri static variable. So that it can allocate and initialize
during class loading for once. And we can access its value whenever we need. Here we can see that using static variable we
make the code memory efficient.
 */