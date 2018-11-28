import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithLambda_1 {

    public void work()	{
        List<Id> persons = Arrays.asList(
                new Id("Franz", 	1234),
                new Id("Wolfgang",	123),
                new Id("Thomas",	12) );

        for (Id p : persons) {
            System.out.println ( p.getName ( ) );
        }
    }
    public static void main(String[] args) {
	new WithLambda_1().work();
    }
}