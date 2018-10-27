
public class InterruptExample extends Thread {

    private String name;

    public InterruptExample(String name) {
        this.name = name;
    }

    public static void sleepForAbit(long sleepTime) {
        try {
            sleep(sleepTime);
        } catch (InterruptedException e) {
            System.err.println("Was interrupted in sleepForAbit");
        }

    }

    public static void main(String args[]) {

        InterruptExample aThread = new InterruptExample("aThread");
        aThread.start();
        sleepForAbit(100);    // should allow the thread to enger the while loop
        aThread.interrupt();

    }

    public void run() {

        System.err.println(name + " has started!");
        double x = 1;
        while (x > 0) {        // forever loop
            x = x * 2 - x;        // x is constant
            if (isInterrupted()) {
                System.err.println(name + "is interrupted");
                break;
            }
        }
        System.err.println(name + " has exited!");
    }
}