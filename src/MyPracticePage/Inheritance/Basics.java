package MyPracticePage.Inheritance;


class Human{
    int age;
    void sleep(int age)
    {
        this.age = age;
        System.out.println("Human Can Sleep");
        System.out.println(age);
    }
}

class Person{

}
class Student extends Human{

}
public class Basics {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.sleep(27);

        Person p1 = new Person();
        // p1.sleep(); There is no method and Person is not a child class of Human

        Student s1 = new Student();
        s1.sleep(25);
    }
}
