public class DeadLock extends Thread {
    private static String o1 = new String ( );
    private static String o2 = new String ( );
    private String info;

    public DeadLock(String info) {
        this.info = info;
    }

    private void inProtected_1() throws InterruptedException {
        synchronized (o2) {
            System.out.println ( "In function 1 " + Thread.currentThread ( ).getName ( ) );
            inProtected_2 ( );
        }
    }

    private void inProtected_2() throws InterruptedException {
        sleep ( 1000 );
        synchronized (o1) {
            System.out.println ( "In function 2 " + Thread.currentThread ( ).getName ( ) );
            inProtected_1 ( );
        }
    }

    public void run() {
        if (info.equals ( "first" )) {
            synchronized (o1) {
                System.out.println ( "In run 1" + Thread.currentThread ( ).getName ( ) );
                try {
                    inProtected_1 ( );
                } catch (InterruptedException e) {
                    e.printStackTrace ( );
                }
            }
        } else
            synchronized (o2) {
                System.out.println ( "In run 2" + Thread.currentThread ( ).getName ( ) );
                try {
                    inProtected_2 ( );
                } catch (InterruptedException e) {
                    e.printStackTrace ( );
                }
            }
    }

    public static void main(String args[]) {
        new DeadLock ( "second" ).start ( );
        new DeadLock ( "first" ).start ( );
    }
}