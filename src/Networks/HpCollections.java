package Networks;

import java.util.*;

public class HpCollections {

  static Object anArray[] = null;


  public static void sort(List aList) {
	anArray = aList.toArray();

    	for (int index=0; index<anArray.length - 1; index++)     {
            for (int walker=0; walker<anArray.length - index - 1; walker++)  {
		String left = (String) anArray[walker];
		String right = (String) anArray[walker+1];
                if ( left.compareTo( right ) > 0 )        {
                        Object tmp = anArray[walker];
                        anArray[walker] = anArray[walker + 1];
                        anArray[walker+1] = tmp;
                }
            }
    	}
        aList = Arrays.asList(anArray);

  }
  public String toString()	{
	String s = new String ();
    	for (Object o: anArray )
		s = s + "/" + o ;
	return s;
   }

  public static void main(String args[]) {
	args = new String[4];
	args[0] =  "z"; args[1] =  "x";
	args[2] =  "a"; args[3] =  "t";
        List l = Arrays.asList(args);
        // HpCollections_remove.sort(l);
        // HpOKCollections.sort(l);
        // Collections.sort(l);
        HpCollections.sort(l);
        System.out.println(l);
    }
}
