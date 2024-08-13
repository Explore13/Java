package MyPracticePage.CollectionFramework;

import java.util.ArrayList;

class Student
{
    String name;
    int age;
    Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
public String method()
{
//    System.out.println(age + " " + name);
    return name+ " " +age;
}
}
public class _1_ArrayList {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<String>();
        arrayList.add(new Student(10, "Surya").method());
        System.out.println(arrayList.get(0));
    }
}
