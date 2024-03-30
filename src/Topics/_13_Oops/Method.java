package Topics._13_Oops;
class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}
public class Method {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
    Calc obj=new Calc();
            int res1=obj.add(4,3);
            int res2=obj.add(4,3,2);
            //double res3=obj.add(4.3,3.2);
            System.out.println(res1+" "+res2+" ");
        }

}
