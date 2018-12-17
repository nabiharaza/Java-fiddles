package Networks;

public class DeadLock extends Thread {
    private static String o1 = new String ( );
    private static String o2 = new String ( );
    private String info;

    public DeadLock(String info) {
        this.info = info;
    }

    private void inProtected_1() {
        System.out.println ("Reached here 1 "+Thread.currentThread ().getName () );
        synchronized (o2) {
            System.out.println ("Here 1 " );
//            inProtected_2 ( );
        }
    }

    private void inProtected_2() {
        System.out.println ("Reached Here 2 "+Thread.currentThread ().getName () );
        synchronized (o1) {
            System.out.println ("Here 2 " );
//            inProtected_1 ( );
        }
    }

    public void run() {
        if (info.equals ( "first" )) {
            System.out.println ("Coming here 1 " +Thread.currentThread ().getName ());
            synchronized (o1) {
                inProtected_1 ( );
            }
        } else
            System.out.println ("Coming here 2 " +Thread.currentThread ().getName ());
            synchronized (o2) {
                inProtected_2 ( );
            }
    }

    public static void main(String args[]) throws InterruptedException {
        new DeadLock ( "first" ).start ( );

        new DeadLock ( "second" ).start ( );

    }
}