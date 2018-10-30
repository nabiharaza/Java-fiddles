import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class HpWorker_1 implements Runnable {

    private int id;
    private int sleepTime;

    public HpWorker_1(int id, int sleepTime) {
        this.id = id;
        this.sleepTime = sleepTime;
    }

    public void run() {
        System.out.println ( "In here!" );
        System.out.println ( "Start =	" + id );
        try {
            Thread.sleep ( sleepTime );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        System.out.println ( "End =	" + id );
    }

    public String toString() {
        return "HpWorker_1: " + id;
    }
}


class HpSimpleThreadPoolUse_1 {
    public static final int MAX = 2;
    public static final int SLEEP_TIME = 1000; // 100

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool ( MAX );
        for (int i = 0; i < MAX * 3; i++) {
            if (i % 2 == 0)
                executor.execute ( new HpWorker_1 ( i, 4 * SLEEP_TIME ) );
            else
                executor.execute ( new HpWorker_1 ( i, SLEEP_TIME ) );
        }
        executor.shutdown ( );
        // awaitTermination(long timeout, TimeUnit unit) throws InterruptedException
        // Blocks until all tasks have completed execution after a
        // shutdown request, or the timeout occurs,
        // or the current thread is interrupted, whichever happens first.

        while (!executor.isTerminated ( )) {
            try {
                Thread.sleep ( 100 );
            } catch (Exception e) {
            }
        }
        System.out.println ( "all threads have terminated" );
    }

}