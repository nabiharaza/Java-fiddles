class Thread_00 extends Thread {
    private String info;

    public Thread_00(String info) {
        this.info = info;
    }

    public static void main(String args[]) {
        Thread aT4_00 = new Thread ( "first" );
        Thread aT4_1 = new Thread ( "second" );

        aT4_00.start ( );
        aT4_1.start ( );
    }

    public synchronized void run() {
        System.err.println ( info + ": is in protected()" );
        System.err.println ( info + ": exit run" );
    }
}