package Topics.Oops;
class Calc_2{
    public void show(byte n){
        System.out.println("byte"+ " " + n);
    }
    public void show(short n){
        System.out.println("short"+ " " + n);
    }
    public void show(char n){
        System.out.println("char"+ " " + n);
    }
    public void show(int n){
        System.out.println("int"+ " " + n);
    }
    public void show(double n){
        System.out.println("double"+ " " + n);
    }
}
public class Auto_Promo {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
    Calc_2 obj= new Calc_2();
    byte b=3;
    obj.show(b);
        }

}
