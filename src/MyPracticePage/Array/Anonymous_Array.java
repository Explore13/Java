package MyPracticePage.Array;

class avgCheck{
    public double avg(int arr[])
    {
        double total = 0;
        for (int i : arr) {
            total += (double)i;
        }
        return total/arr.length;
    }
}
public class Anonymous_Array {
    // Array without name, created just for an instance
    public static void main(String[] args) {
        avgCheck obj = new avgCheck();
        double avg = obj.avg(new int[]{1,2,3,4,5});
        System.out.println(new int[]{10,20,30,40,50}.length);
        System.out.println(avg);
    }
}
