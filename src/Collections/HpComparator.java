package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class HpComparator implements Comparator {


    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s1.compareTo ( s2 );
    }

}

class sort {
    public boolean equals(Object o) {
        return true;
    }

    public static void nabiha(List list, HpComparator h1) {
        Object anArray[] = list.toArray ( );
        // Arrays.sort(a, c);		/////// this is the trick
        // http://www.cs.rit.edu/~hpb/Jdk5/api/java/util/ListIterator.html

        for (int index = 0; index < anArray.length - 1; index++) {
            for (int walker = 0; walker < anArray.length - index - 1; walker++) {
                Object left = anArray[walker];
                Object right = anArray[walker + 1];

                if (h1.compare ( right, left ) > 0) {
                    Object tmp = anArray[walker];
                    anArray[walker] = anArray[walker + 1];
                    anArray[walker + 1] = tmp;
                }
            }
        }


        ListIterator i = list.listIterator ( );
        for (int j = 0; j < anArray.length; j++) {
            i.next ( );
            i.set ( anArray[j] );
        }
    }


    public int compareTo(Object o) {
        return 0;

    }


    public static void main(String args[]) {
        args = new String[4];


        List l = Arrays.asList ( args );

        System.out.println ( "1. " + l );

        args[0] = "x";
        args[1] = "b";
        args[2] = "a";
        args[3] = "d";
        l = Arrays.asList ( args );
        sort.nabiha ( l, new HpComparator ( ) );
        System.out.println ( "2. " + l );

    }
}



