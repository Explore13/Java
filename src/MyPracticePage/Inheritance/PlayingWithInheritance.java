package MyPracticePage.Inheritance;

class Demo {
    private int a;
    private int b;

    Demo(int a, int b) {
        System.out.println("Parent");
        this.a = a;
        this.b = b;
    }
    Demo() {
        System.out.println("Default");
    }

    void getData() {
        System.out.println("Parent : "+ this.a + " " + this.b);
    }
}

class DemoChild extends Demo {
    private int m;
    private int n;

    DemoChild(int m, int n) {
//        super(m, n);
        System.out.println("Child");
        this.m = m;
        this.n = n;
    }

    void getData() {
        super.getData();
        System.out.println("Child : " + this.m + " " + this.n);
    }
}

public class PlayingWithInheritance {
    public static void main(String[] args) {
        DemoChild dc = new DemoChild(2, 3);
        dc.getData();

    }
}
