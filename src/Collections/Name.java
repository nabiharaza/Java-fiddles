package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Name  implements Comparable{
    protected String firstName, lastName;

    public Name(String firstName, String lastName) {
        if (firstName == null || lastName == null)
            throw new NullPointerException ( );
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Name))
            return false;
        Name n = (Name) o;
        return n.firstName.equals ( firstName ) &&
                n.lastName.equals ( lastName );
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public int compareTo(Object o) {
        Name n = (Name) o;
        int lastCmp = lastName.compareTo ( n.lastName );
        return (lastCmp != 0 ? lastCmp :
                firstName.compareTo ( n.firstName ));
    }


    public static void main(String args[]) {
        Name n[] = {
                new Name ( "Bond", "James" ),
                new Name ( "Jack", "Blues" ),
                new Name ( "Elwood", "Blues" ),
                new Name ( "You", "Me" )
        };
        Object o;
        List l = Arrays.asList ( n );
        Collections.sort ( l );
        System.out.println ( l );
    }
}
