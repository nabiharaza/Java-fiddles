package Networks;

public class T_4_1 extends Thread {
    static Object o = new Object ( );

    public T_4_1()	{
        o  = new Object();
    }


    public void run() {
        synchronized (o) {
            System.err.println ( "--->" + Thread.currentThread ().getName () );

            System.err.println ( "<---" + Thread.currentThread ().getName ());
        }
    }

    public static void main(String args[]) {
        new T_4_1 ( ).start ( );
        new T_4_1 ( ).start ( );
        new T_4_1 ( ).start ( );
    }
}