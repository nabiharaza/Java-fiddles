package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExTree {

    protected String firstName;
    protected String lastName;

    static final Comparator nameC = new Comparator ( ) {
        public int compare(Object o1, Object o2) {
            ComparatorExTree n1 = (ComparatorExTree)o1;	// cast execption
            ComparatorExTree n2 = (ComparatorExTree)o2;	// cast execption
            return n1.lastName.compareTo(n2.lastName);
        }

    };

    public ComparatorExTree(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Object o) {
        if (!(o instanceof ComparatorExTree))
            return false;
        ComparatorExTree n = (ComparatorExTree) o;
        return firstName.equals ( n.firstName ) &&
                lastName.equals ( n.lastName );
    }

    public String toString() {
        return firstName + "; " + lastName;
    }

    public int compareTo(Object o) {
        ComparableEx n = (ComparableEx) o;       // cast execption
        if (firstName.compareTo ( firstName ) == 0)
            return lastName.compareTo ( lastName );
        else
            return 0;
    }

    public static void main(String args[]) {
        ComparatorExTree n[] = {
                new ComparatorExTree ( "You", "Name" ),
                new ComparatorExTree ( "Roger", "Bond" ),
                new ComparatorExTree ( "Jack", "Blues" ),
                new ComparatorExTree ( "James", "Bond" ),

                new ComparatorExTree ( "Elwood", "Blues" )
        };TreeSet l = new TreeSet ( nameC );

        for (int i = 0; i < n.length; i++) {
            System.out.println ( i + " " + n[i] );
            l.add ( n[i] );
        }
        System.out.println ( "the TreeSet: " + l );
    }
}
