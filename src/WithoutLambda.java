import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutLambda {

    public static void printIdsHigherThan(List<Id> roster, int low, int high) {


        roster.forEach ( p -> {
            if ((low <= p.getNumber ( )) && (p.getNumber ( ) <= high))
                p.printNumber ( );
        } );

    }

    public static void main(String[] args) {
        List<Id> persons = Arrays.asList (
                new Id ( "Franz", 1234 ),
                new Id ( "Wolfgang", 123 ),
                new Id ( "Thomas", 12 ) );

        printIdsHigherThan ( persons, 12, 123 );
    }

}