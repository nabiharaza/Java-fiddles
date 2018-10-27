class Thread_3 extends Thread {
    Thread_3 aT1;
    private String info;

    public Thread_3(String info) {
        this.info = info;
    }

    public static void sleepForAbit(long sleepTime) {
        try {
            sleep(sleepTime);
        } catch (InterruptedException e) {
            System.err.println("Was interrupted in sleepForAbit");
        }

    }

    public static void main(String args[]) {
        Thread_3 aT1 = new Thread_3("first");

        aT1.start();
        sleepForAbit(100);
        System.err.println("interrupt 'first'");
        aT1.interrupt();
    }

    public void run() {
        System.out.println(info + " is running");
        try {
            sleep(1000000);        // thread has to be here
        } catch (InterruptedException e) {
            System.err.println("Interrupted!");
            if (isInterrupted())
                System.err.println("yup it's true.");
        }
        System.out.println(info + ": exit run");

    }
}