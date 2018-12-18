package Collections;/*
 * "Note: this class has a natural ordering
 *        that is inconsistent with equals.
 */

import java.util.*;

public class ComparableEx implements Comparable {
    protected String  firstName;
    protected String  lastName;

    public ComparableEx(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    public boolean equals(Object o) {
        if (!(o instanceof ComparableEx))
            return false;

        ComparableEx n = (ComparableEx)o;
        return firstName.equals(n.firstName)	&&
               lastName.equals(n.lastName);
    }

    public int compareTo(Object o) {
        if (!(o instanceof ComparableEx))
            return 1;
        ComparableEx n = (ComparableEx)o;	// cast execption
	return lastName.compareTo(lastName);
    }
    public String toString()	{
		return firstName + "/" + lastName;
    }

    public static void main(String args[]) {
        Object n[] = {
            new ComparableEx("James", 	"Bond"),
            new ComparableEx("James", 	"Bond"),
            new Nabiha("Jack", 	"Blues"),
            new Nabiha("Elwood", 	"Blues")
        };


        List l = Arrays.asList(n);
        Collections.sort(l);
        System.out.println(l);
    }
}

class Nabiha implements Comparable{
    protected String  firstName;
    protected String  lastName;

    public Nabiha(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName  = lastName;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Nabiha))
            return 0;
        Nabiha n = (Nabiha)o;	// cast execption
        return lastName.compareTo(lastName);
    }
}