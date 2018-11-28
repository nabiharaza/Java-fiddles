//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Collections;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class WithLambda_2 implements CheckNoLimit {
//
//    public boolean doTheCheck(Id p) {
//        return p.getNumber ( ) >= 12 && p.getNumber ( ) <= 123;
//    }
//
//    public static void printPersons(List<Id> roster, CheckNoLimit tester) {
//
//        roster.forEach ( p -> {
//            if (tester.doTheCheck ( p ))
//                p.printName ( );
//        } );
//    }
////
//    public void work() {
//        List<Id> persons = Arrays.asList (
//                new Id ( "Franz", 1234 ),
//                new Id ( "Wolfgang", 123 ),
//                new Id ( "Thomas", 12 ) );
//
//        printPersons ( persons, new WithLambda_2 ( ) );
//    }
//
//    public static void main(String[] args) {
//        new WithLambda_2 ( ).work ( );
//    }
//}