import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutLambdaAnonmymousClass {

    public void printIdsHigherThanWithTester(List<Id> roster,
                                             Check tester,
                                             int low, int high) {
        for (Id p : roster) {
            if (tester.doTheCheck ( p, low, high ))
                p.printNumber ( );
        }
    }

    public void work() {
        List<Id> persons = Arrays.asList (
                new Id ( "Franz", 1234 ),
                new Id ( "Wolfgang", 123 ),
                new Id ( "Thomas", 12 ) );

            Check check = (Id thisId,
                           int low, int high) ->


                        low <= thisId.getNumber ( ) && thisId.getNumber ( ) <= high;

            ;


            printIdsHigherThanWithTester ( persons, check, 12, 123 );
    }

    public static void main(String[] args) {

        new WithoutLambdaAnonmymousClass ( ).work ( );
         int p;
        if ( 10 > 20 ) {
            int c = 10;
        }
            p = 10;


    }
}