package Collections;

        import java.util.*;

public class UseIterator {
    public static void main(String args[]) {
        int index = 0;
        List l = Arrays.asList(args);
        Iterator aIterator = l.iterator();
        while ( aIterator.hasNext() )	{
            System.out.println(++index + ": " + aIterator.next() );
        }
    }
}