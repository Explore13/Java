package MyPracticePage.CollectionFramework;

import javax.swing.text.html.ObjectView;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class _2_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();

        ad.add(1);
        ad.add("Hi");
        ad.add("Hello");
        System.out.println(ad);
        ad.addFirst(100);
        ad.addLast("AtLast");
        System.out.println(ad);
        Object obj = ad.remove(); // From first
        System.out.println(ad + " " + obj);

        ArrayList al = new ArrayList();
        al.add(1000);
        al.add(2000);
        al.add(3000);
        al.add(4000);

        System.out.println(al);

        // ad.add(al); // [100, 1, Hi, Hello, AtLast, [1000, 2000, 3000, 4000]]
        ad.addAll(al); // [100, 1, Hi, Hello, AtLast, 1000, 2000, 3000, 4000]
        System.out.println(ad);


        ArrayList<ArrayDeque> al2 = new ArrayList<ArrayDeque>();
        // al2.add("Hi"); // java: incompatible types: java.lang.String cannot be converted to java.util.ArrayDeque
        al2.addAll(ad);
        System.out.println(al2);

        al2.add(ad);
        System.out.println(al2);

        // ad.clear(); // delete all
        // obj = ad.element(); // First Value (If empty then exception)
        // ad.add(null); // Exception
        System.out.println(ad);
        // obj = ad.peek(); // First value ( if empty then return null)

        obj = ad.pop(); // From front
        System.out.println(ad);
    }
}
