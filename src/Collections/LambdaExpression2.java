package Collections;

import java.util.ArrayList;

class LambdaExpression2 {
    public static void main(String args[]) {
        ArrayList<Integer> arrL = new ArrayList<Integer> ( );
        arrL.add ( 1 );
        arrL.add ( 2 );
        arrL.add ( 3 );
        arrL.add ( 4 );

//        arrL.forEach(n -> { if (n % 2 == 0) System.out.println(n); });
        for (Integer a1 : arrL) {
            if (a1 % 2 == 0)
                System.out.println ( a1 );

        }

    }
} 