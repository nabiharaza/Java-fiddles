import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutLambdaInterface implements Check {

    public boolean doTheCheck(Id thisId, int low, int high) {
        return ((low <= thisId.getNumber ( ))
                && (thisId.getNumber ( ) <= high));
    }

    public void printIdsHigherThan(List<Id> roster, int low, int high) {

        roster.forEach ( p -> {
            if (doTheCheck ( p, low, high ))
                p.printNumber ( );
        } );
    }

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

        System.out.println ( "printIdsHigherThan(persons, 12, 123);" );
        printIdsHigherThan ( persons, 12, 123 );

        System.out.println ( "printIdsHigherThanWithTester(persons, new WithoutLambdaInterface(), 12, 123);" );
        printIdsHigherThanWithTester ( persons, new WithoutLambdaInterface ( ), 12, 123 );
    }

    public static void main(String[] args) {
        new WithoutLambdaInterface ( ).work ( );
    }
}