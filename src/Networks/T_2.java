package Networks;

public class T_2 extends Thread {
    private String info;

    public T_2(String info) {
        this.info = new String ( info );
    }

    private void inProtected() {
        synchronized (info) {
            System.err.println ( "--> " + info );
            try {
                sleep ( 1000 );
            } catch (Exception e) {
                e.printStackTrace ( );
            }
            System.err.println ( "<-- " + info );
        }
    }

    public void run() {
        inProtected ( );
    }

    public static void main(String args[]) {
        String a = "hello";
        new T_2 ( "hello").start ( );
        new T_2 ( "hello").start ( );

    }
}