package MyPracticePage.Polymorphism;

/*
Nothing there, just making the constructors final.. haha
 */
class Sons extends Father {
    int age;


    public Sons(int age) {
        this.age = age;
    }

    public Sons() {
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

    public int age() {
        return this.age;
    }
}


class GrandSon {
    public GrandSon() {
//    this.age = age;
        System.out.println("Hello from GrandSon");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {

        GrandSon g1 = new GrandSon();

    }
}
