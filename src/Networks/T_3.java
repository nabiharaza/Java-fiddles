package Networks;

import java.util.Vector;
public class T_3 extends Thread    {
    static Vector aVector = new Vector();
    private int info;

    public T_3 (int info) {
        this.info    = info;
    }

    public void run () {
        synchronized (aVector) {
            System.err.println("--> " + info);
            try {
                  sleep(1000);
            } catch (  Exception e ) {
                e.printStackTrace();
            }
            System.err.println("<-- " + info);
        }

    }

    public static void main (String args []) {
        for ( int i = 1; i < 10; i ++ )
                new T_3(i).start();
    }
}