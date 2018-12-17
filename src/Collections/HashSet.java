package Collections;

import java.util.Set;

public class HashSet {

    private Set<Integer> universe;

    private Set<Integer> fill(int soMany) {
        Set<Integer> universe = new java.util.HashSet ( );
        for (int index = 0; index < soMany; index++)
            universe.add ( new Integer ( 2 * index ) );
        return universe;
    }

    public static void main(String args[]) {
        Set<Integer> universe = null;
        HashSet aHashSet = new HashSet ( );
        universe = aHashSet.fill ( 10 );

        System.out.println ( "1: " + universe );

        // universe.remove( new Integer(1) );
        // System.out.println("2: " + universe );

        universe.remove ( 14 );
        System.out.println ( "1: " + universe );
        // System.out.println("3: " + universe );
    }
}
       /* 
        for(Integer id : stars.keySet()) {
            ids.add(id);
            
            if(ids.size() >= keepStars)
                break;
        }
        
        return ids;
	*/