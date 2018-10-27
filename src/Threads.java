
class Thread_1b implements Runnable {

    int x = 0;
    private String info;

    public Thread_1b(String info) {
        this.info = info;
    }

    public static void main(String args[]) {
        if (args != null) {
            for (int n = 0; n < args.length; ++n) {
                new Thread(new Thread_1b("" + n)).start();
            }
        }
    }

    public void run() {
        x = 1;
        System.out.print(info);
    }
}