package Topics._14_Encapsulation;
class Student5{
    private int age;
    private String name;


    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class Setters_Getters {
    public static void main(String[] args) {
        Student5 obj1=new Student5();
        Student5 obj2=new Student5();
        obj1.setAge(18);
        obj2.setAge(19);
        obj1.setName("Krishna");
        obj2.setName("Surya");
        int obj1Age= obj1.getAge();
        int obj2Age= obj2.getAge();
        String obj1Name= obj1.getName();
        String obj2Name= obj2.getName();
        System.out.println(obj1Name+" "+obj1Age);
        System.out.println(obj2Name+" "+obj2Age);
    }
}
