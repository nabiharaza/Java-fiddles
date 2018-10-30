import java.util.Vector;

class Thread_5 extends Thread {
    static Vector aVector;
    Object lol;
    private String info;

    public Thread_5(String info, Vector aVector) {
        this.info = info;
        Thread_5.aVector = aVector;
        this.lol = "lol";
    }

    public static void main(String args[]) {
        Vector aVector = new Vector ( );
        Thread_5 aT5_0 = new Thread_5 ( "first", aVector );
        Thread_5 aT5_1 = new Thread_5 ( "second", aVector );

        aT5_0.start ( );
        aT5_1.start ( );
//        sleep (2000);
//        aT5_0.interrupt ();
    }

    public void inProtected() {
        synchronized (lol) {
            System.err.println ( info + ": is in protected()" );
            try {
//                if ( info.equals("second") )
//                    sleep(1000);
//                else
//                    sleep(1000);
                System.out.println ( "Runing " + info );
            } catch (Exception e) {
                System.err.println ( "Interrupted!" );
            }
            System.err.println ( info + ": exit run" );
        }
    }

    public void run() {
        inProtected ( );
    }
}