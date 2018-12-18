package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;



public class Hash_1 extends Name {
    static final int MAX = 20000;
    static HashMap aHashMap = new HashMap ( );

    public Hash_1(String firstName, String lastName) {
        super ( firstName, lastName );
    }


    public static void init() {
        long milliSeconds = System.currentTimeMillis ( );
        for (int index = 0; index <= MAX; index++) {
            if (index % 1000 == 0)
                System.out.println ( index + "/" + MAX );
            aHashMap.put ( new Hash_1 ( "A" + index, "A" + index ),
                    new Hash_1 ( "A" + index, "A" + index )
            );
        }
        System.out.println ( "Time for filling: " +
                (System.currentTimeMillis ( ) - milliSeconds) );
    }

    public static void findIt(Hash_1 aHash_1) {
        long milliSeconds = System.currentTimeMillis ( );
        System.out.println (aHash_1 );
        if (aHashMap.containsKey ( aHash_1 ))
            System.out.print ( "\taHashMap: containsKey takes: " );
        System.out.println ( System.currentTimeMillis ( ) - milliSeconds );

    }

    public static void findMax() {
        Hash_1 aHash_1 = new Hash_1 ( "A" + MAX, "A" + MAX );
        System.out.println ( "Find Max = " + aHash_1 );
        findIt ( aHash_1 );
    }

    public static void findMiddle() {
        Hash_1 aHash_1 = new Hash_1 ( "A" + (MAX / 2), "A" + (MAX / 2) );
        System.out.println ( "Find Middle = " + aHash_1 );
        findIt ( aHash_1 );
    }

    public static void findMin() {
        Hash_1 aHash_1 = new Hash_1 ( "" + 0, "" );
        System.out.println ( "Find Min = " + aHash_1 );
        findIt ( aHash_1 );
    }


    public static void main(String args[]) {
        long milliSeconds = System.currentTimeMillis ( );

        ArrayList<Integer> al1 = new ArrayList<> (  );
        al1.add(1);


        ArrayList<Integer> al2 = new ArrayList<> (  );
        al2.add ( 99 );
        al2.add ( 98 );
        al2.add ( 98 );

        Collections.copy(al1,al2);
        System.out.println (al1 );

//        init ( );
//        findMax ( );
//        findMiddle ( );
//        findMin ( );
//        System.exit ( 0 );
    }
}
