package Topics._08_Anonymous_Array;
class Calc{
public int add(int nums[]){
    int result=0;
    for (int n:nums){
        result +=n;
    }

    return result;
}
}
public class AnonymousArray {
    public static void main(String[] args) {
        Calc obj=new Calc();
       // int nums[]={1,2,3,4};
        int result;
        result=obj.add(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}
