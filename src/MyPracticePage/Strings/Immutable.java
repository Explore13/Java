package MyPracticePage.Strings;

public class Immutable {
    public static void main(String[] args) {
        String s1 = "Surya"; // SCP
        String s2 = "Surya"; // SCP and Same Reference
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true
        String s3 = new String("Hi"); // SCP and Heap
        String s4 = new String("Hi"); // SCP and Heap
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true

        s1.concat(" Ghosh");
        System.out.println(s1); // Immutable, String will be same
        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2)); //true
        s3.concat("Hello"); // Immutable String, new string is not referred by s3
        System.out.println(s3);
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true


        s2 = s2.concat(" Ghosh"); // Reference added and obj created in Heap now as we are referring something
        System.out.println(s2);
        System.out.println(s1 == s2);// false
        System.out.println(s1.equals(s2)); // false

        s1 = s1.concat(" Ghosh"); // New obj created in heap as we are using reference of s1
        System.out.println(s1 == s2); // false ( Reference can not be same in heap memory)
        System.out.println(s1.equals(s2)); // true
        s4 = s4.concat("Hello"); // New Object created in heap memory and referred tp that obj
        System.out.println(s4);


        String s5 = "surya";
        String s6 = "SuRyA";
        String s7 = new String("SURYA");

        System.out.println(s5 == s6); // false
        System.out.println(s5.equalsIgnoreCase(s6)); // true
        System.out.println(s6.equalsIgnoreCase(s7)); // true
        System.out.println(s6 == s7); // false


        s5 = s5 + s6 + s7;
        System.out.println(s5); // Using reference, created in heap
        String s8 = "Surya " + "Ghosh"; // using values, created in SCP
        System.out.println(s8);
        String s9 = "Surya" + 20; // + operator we consider 20 as string
        System.out.println(s9);
        // String s10 = s9.concat(21); // Error, concat method takes String as parameter
        String s10 = s9.concat("24");
        System.out.println(s10);

        String s11 = new String("Hii");
        String s12 = s11 + "Hello";
        System.out.println(s12);
        String s13 = new String("Ho");
        System.out.println(s11 + s13);
        // System s14 = new String("Hi"+"Bro"); // Not Possible
        // System.out.println(s14);

        System.out.println(s13.length());
    }
}

