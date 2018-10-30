class counter extends java.lang.Thread {
    int c = 0;

    synchronized void increment() {
        c++;
    }

    public void run() {
        for (int i = 0; i < 10000000; i++)
            increment ( );
    }
}


class Thread {
    int i = 0;
    private String info;

    public Thread(String info) {
        this.info = info;
    }


    public static void main(String args[]) {

        counter c = new counter ( );
        counter c2 = new counter ( );

        c.start ( );
        c2.start ( );

//        Thread aT4_00 = new Thread("first");
//        Thread aT4_1 = new Thread("second");

//        Thread t1 = new Thread(new Runnable() { // 1st thred
//            @Override
//            public void run() {
//                for( int i = 0; i < 100000; i++)// 1 lakh
//                    c.increment();
//            }
//        });


//        Thread t2 = new Thread(new Runnable() { // 2nd thread
//            @Override
//            public void run() {
//                for( int i = 0; i < 100000; i++)//1 lakh
//                    c.increment();
//            }
//        });

//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();

//        c.join();
//        c2.join();

        System.out.println ( c.c + " " + c2.c );


    }
}


