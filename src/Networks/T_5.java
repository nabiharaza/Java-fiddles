package Networks;

public class T_5 extends Thread    {
    static Object o = new Object();
    static int    counter = 0;

    public void run () {
        if (++counter == 0)
            o = new Object ( );

        synchronized ( o ) { 
            System.err.println("--->" +Thread.currentThread ().getName ());

            System.err.println("<---" +Thread.currentThread ().getName ());
        }
    }

    public static void main (String args []) {
        new T_5().start();
        new T_5().start();
        new T_5().start();
    }
}