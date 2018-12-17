package Networks;

import java.util.Random;

/**
 * A class implementing the Dining Philosphers
 */
public class Philosopher extends Thread {

    protected static Random random = new Random ( );        // randomize
    protected int me;                // number for trace
    protected Integer left, right;    // my chopsticks

    public Philosopher(int me, Integer left, Integer right) {
        this.me = me;
        this.left = left;
        this.right = right;
    }

    /**
     * philosopher's body: think and eat 5 times
     */
    public void run() {
        for (int n = 1; n <= 5; ++n) {
            System.out.println ( me + " thinks" );
            try {
                Thread.sleep ( (long) (random.nextFloat ( ) * 1000) );
            } catch (Exception e) {
                e.printStackTrace ( );
            }
            System.out.println ( me + " is trying to eat" );
            synchronized (left) {
                synchronized (right) {
                    System.out.println ( "\t" + me + " eats" );
                    try {
                        Thread.sleep ( (long) (random.nextFloat ( ) * 1000) );
                    } catch (Exception e) {
                        e.printStackTrace ( );
                    }
                }
            }
            System.out.println ( "\t" + me + " leaves" );
        }
    }

    /**
     * sets up for 5 philosophers
     */
    public static void main(String args[]) {
        Integer f[] = new Integer[5];
        for (int n = 0; n < 5; ++n)
            f[n] = new Integer ( n );
        Philosopher p[] = new Philosopher[5];
        p[0] = new Philosopher ( 0, f[4], f[0] );      // backwards
        for (int n = 1; n < 5; ++n)
            p[n] = new Philosopher ( n, f[n - 1], f[n] );
        for (int n = 0; n < 5; ++n) p[n].start ( );
    }
}