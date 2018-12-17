package Networks;

import java.util.*;

public class T_6 extends Thread    {
    static Object o = new Object();
    static int    counter = 0;

    public void run () {
	if ( counter++ == 1 )	
		o = new Object();
	
        synchronized ( o ) { 
            System.err.println("--->" +Thread.currentThread ().getName ());
//            try {
//                    sleep(1000);
//            }
//            catch (  InterruptedException e ) {
//                System.err.println("Interrupted!");
//            }
            System.err.println("<---" +Thread.currentThread ().getName ());
        }
    }

    public static void main (String args []) {
        new T_6().start();
        new T_6().start();
        new T_6().start();
    }
}