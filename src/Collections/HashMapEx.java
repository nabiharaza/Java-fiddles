package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

    private Map<Integer, String> universe;

    private Map<Integer, String> fill(int soMany) {
        universe = new HashMap<Integer, String> ( );
        for (int index = 0; index < soMany; index++)
            universe.put ( new Integer ( index ), "_" + index );
        return universe;
    }

    private Map<Integer, String> delete(int what) {
        try {
            for (Integer id : universe.keySet ( )) {
                System.out.println ( "try to delete: " + id );
                if (id.equals ( new Integer ( what ) ))
                    universe.remove ( id );
                System.out.println ( "deleted: " + id );
            }
        } catch (Exception e) {
            System.out.println ( "Exception ..... " );
            e.printStackTrace ( );
        }
        return universe;

    }

    private Map<Integer, String> deleteUsingKeySetCorrect(int what) {
        try {
            Iterator aIterator = universe.keySet ( ).iterator ( );
            while (aIterator.hasNext ( )) {
                aIterator.next ( );
                aIterator.remove ( );
            }
        } catch (Exception e) {
            System.out.println ( "Exception " );
            e.printStackTrace ( );
        }
        return universe;

    }

    public static void main(String args[]) {
        Map<Integer, String> universe;
        HashMapEx aHashMapEx = new HashMapEx ( );
        universe = aHashMapEx.fill ( 3 );

        System.out.println ( "1: " + universe );
        aHashMapEx.deleteUsingKeySetCorrect ( 1 );


        universe = aHashMapEx.fill ( 3 );
        aHashMapEx.delete ( 1 );
        System.out.println ( "2: " + universe );

    }
}