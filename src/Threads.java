class Threads {
    private static int count = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("One");
                count++;
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("TWO");
                count++;
            }
        });
        t1.start();
        t2.start();
        System.out.println(count);
    }
}