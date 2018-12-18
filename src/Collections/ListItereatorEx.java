package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;
import java.util.Stack;

public class ListItereatorEx {
    // private Collection<String> palindrom;
    private Stack<String> palindrom;

    private Collection<String> fill(String words[]) {
        palindrom = new Stack<String> ( );
        for (String id : words) {
            palindrom.push ( id );
        }
        return palindrom;
    }

    private Collection<String> leftRight() {
        ArrayList<Integer> i ;
        int pl = 90;
        Integer pl2 = new Integer ( 90 );
        pl2.compareTo ( 80 );
        ListIterator<String> aListIterator = palindrom.listIterator (  );
        String s = aListIterator.next ();
        System.out.println ( "s = " + s );
        aListIterator.set ( "ZZ top" );
        return palindrom;
    }

    public static void main(String args[]) {
        Collection<String> aStack;
        String theOnes[] = {"a", "b", "c", "d"};
        ListItereatorEx o = new ListItereatorEx ( );

        aStack = o.fill ( theOnes );
        System.out.println ( "1: " + aStack );

        aStack = o.leftRight ( );
        System.out.println ( "2: " + aStack );

    }
}