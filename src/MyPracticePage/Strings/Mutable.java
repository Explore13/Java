package MyPracticePage.Strings;

public class Mutable {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("Surya"); // Same obj just Surya is added, Reference is same
        System.out.println(s1.capacity()); // 16 (Normal)
        s1.append("GhoshExplorer"); // Length becomes 18
        System.out.println(s1.capacity()); // (16+1)*2 = 34 (New Capacity)

        s1 = new StringBuilder("Rohit"); // New obj created, Reference is not same
        System.out.println(s1.capacity()); // Capacity becomes 16+5 = 21 because we are passing String directly to the constructor

        StringBuilder s2 = new StringBuilder(100); // Capacity becomes 100
        System.out.println(s2.capacity());

        final StringBuffer s3 = new StringBuffer();
        s3.append("Hello"); // Changes happened in same obj so not problem

        // s3 = new StringBuffer("Sachin"); // Problem occurred as we make s3 as final variable, we can't change the reference
        System.out.println(s3.length());

    }
}
