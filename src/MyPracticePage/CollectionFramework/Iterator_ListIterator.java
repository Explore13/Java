package MyPracticePage.CollectionFramework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_ListIterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add("Hi");

        /*
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+" ");
        }
         */

        //        for(Object o : al)
//        {
//            /*
//            if(o) // java.lang.Object cannot be converted to boolean
//            {
//                System.out.print(o+ " ");
//            }
//             */
//
//            System.out.print(o + " ");
//        }

        Iterator itr = al.iterator();

        while(itr.hasNext())
        {
            System.out.print(itr.next()+ " ");
        }


        System.out.println();// new line

        ListIterator listIterator = al.listIterator(al.size()); // Index set to end of the list
        while (listIterator.hasPrevious())
        {
            System.out.print(listIterator.previous() + " ");
        }

    }
}
