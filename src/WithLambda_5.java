import java.util.Arrays;
        import java.util.Comparator;
        import java.util.Collections;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;

public class WithLambda_5 implements Check {


    public boolean doTheCheck(Id p, int low, int high)  {
        return p.getNumber() >= low  && p.getNumber() <= high;
    }
    public static void printPersons(List<Id> roster, Check tester, int low, int high) {
        for (Id p : roster) {
            if (tester.doTheCheck ( p, low, high ))
                p.printName();
        }
    }


    public void work()	{
        List<Id> persons = Arrays.asList(
                new Id("Franz", 	1234),
                new Id("Wolfgang",	123),
                new Id("Thomas",	12) );

//        Check c1 = (p, low, high)->p.getNumber() >= low  && p.getNumber() <= high;
        printPersons(persons, (p, low, high)->p.getNumber() >= low  && p.getNumber() <= high, 10  ,10);
    }
    public static void main(String[] args) {


        new WithLambda_5().work();
    }
}