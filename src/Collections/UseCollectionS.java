package Collections;

import java.util.*;

public class UseCollectionS {
    static ArrayList aArrayList = new ArrayList ( );
    static HashMap aHashMap = new HashMap ( );

    public static void main(String args[]) {

        for (int index = 0; index < args.length; ++index) {
            System.out.println ( args );
            aHashMap.put ( args[index], args[index] + " " + new Date ( ) );
        }
        System.out.println ( "The HashMap: " + aHashMap );
        List l = new ArrayList ( aHashMap.values ( ) );
        Collections.sort ( l );
        System.out.println ( "The List: " + l );


    }
}