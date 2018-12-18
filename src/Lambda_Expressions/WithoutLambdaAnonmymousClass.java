package Lambda_Expressions;

import java.util.Arrays;
import java.util.List;

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

        Check c1 =
                (Id thisId, int low, int high)
                        -> (low <= thisId.getNumber ( ) && thisId.getNumber ( ) <= high);


        printIdsHigherThanWithTester ( persons, c1, 12, 123 );


    }


    public static void main(String[] args) {
        new WithoutLambdaAnonmymousClass ( ).work ( );

    }
}