package MyPracticePage.Array;

public class Same_Value {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,4,6,8,3};
        int count=0;
        System.out.println("Same Elements: ");
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    count++;
                }
            }
        }
        if (count==0){
            System.out.print("None");
        }
    }
}
