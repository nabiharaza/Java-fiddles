class Threads {
    private static int count = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    System.out.println("One");
                    count++;
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("TWO");
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Two");
                    count++;
                }
                count++;
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(count);
    }
}