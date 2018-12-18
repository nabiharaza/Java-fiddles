package Lambda_Expressions;

import java.util.Arrays;
import java.util.List;

public class WithoutLambda {

    public static void printIdsHigherThan(List<Lambda_Expressions.Id> roster, int low, int high) {

        roster.stream ( )
                .filter ( x -> x.getNumber ( ) >= low && (x.getNumber ( ) <= high) )
                .forEach ( x -> System.out.println ( x ) );
    }

    public static void main(String[] args) {
        List<Id> persons = Arrays.asList (
                new Id ( "Franz", 1234 ),
                new Id ( "Wolfgang", 123 ),
                new Id ( "Thomas", 12 ) );

        printIdsHigherThan ( persons, 12, 123 );
    }

}