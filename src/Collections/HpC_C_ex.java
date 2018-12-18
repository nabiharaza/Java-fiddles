//package Collections;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.ListIterator;
//
//class HpComparator implements Comparator {
//    public int compare(Object o1, Object o2) {
//        String s1 = (String) o1;
//        String s2 = (String) o2;
//        return s2.compareTo ( s1 );
//    }
//
//    public boolean equals(Object o) {
//        return true;
//    }
//
//    private boolean compareTo(Object right) {
//    }
//}
//
//public class HpC_C_ex {
//    public static void sort(List aList) {
//        Object anArray[] = aList.toArray ( );
//
//        for (int index = 0; index < anArray.length - 1; index++) {
//            for (int walker = 0; walker < anArray.length - index - 1; walker++) {
//                Comparable left = (Comparable) anArray[walker];
//                Comparable right = (Comparable) anArray[walker + 1];
//                if (left.compareTo ( right ) > 0) {
//                    Object tmp = anArray[walker];
//                    anArray[walker] = anArray[walker + 1];
//                    anArray[walker + 1] = tmp;
//                }
//            }
//        }
//        ListIterator anIterator = aList.listIterator ( );
//        for (int j = 0; j < anArray.length; j++) {
//            anIterator.next ( );
//            anIterator.set ( anArray[j] );
//        }
//
//    }
//
//    public static void sort(List aList, Comparator aComparator) {
//        Object anArray[] = aList.toArray ( );
//
//        for (int index = 0; index < anArray.length - 1; index++) {
//            for (int walker = 0; walker < anArray.length - index - 1; walker++) {
//                Object left = anArray[walker];
//                Object right = anArray[walker + 1];
//                if (aComparator.compare ( left, right ) > 0) {
//                    Object tmp = anArray[walker];
//                    anArray[walker] = anArray[walker + 1];
//                    anArray[walker + 1] = tmp;
//                }
//            }
//        }
//        ListIterator anIterator = aList.listIterator ( );
//        for (int j = 0; j < anArray.length; j++) {
//            anIterator.next ( );
//            anIterator.set ( anArray[j] );
//        }
//
//    }
//
//    public static void main(String args[]) {
//        args = new String[4];
//
//        args[0] = "x";
//        args[1] = "b";
//        args[2] = "a";
//        args[3] = "d";
//        List l = Arrays.asList ( args );
//        HpC_C_ex.sort ( l );
//        System.out.println ( "1. " + l );
//
//        args[0] = "x";
//        args[1] = "b";
//        args[2] = "a";
//        args[3] = "d";
//        l = Arrays.asList ( args );
//        HpC_C_ex.sort ( l, new HpComparator ( ) );
//        System.out.println ( "2. " + l );
//
//    }
//}
