import java.util.Vector;
public class T_1 extends Thread    {
    private String info;
    Vector aVector;
    Vector bVector;

    public T_1 (String info, Vector aVector) {
        this.info = info;
        this.aVector = aVector;
    }
     public void run() {
       synchronized ( aVector )    {
        if (  info.equals("last") )    {
            aVector.notifyAll();
        } else {
            System.out.println(info + " is waiting");
            try {
                aVector.wait();
            } catch ( Exception  e )    {
                System.out.println(info +
                  ": InterruptedException");
            }
            System.out.println(info + " is awake!");
        }
      }
    }
    public static void main (String args []) {
        Vector aVector = new Vector();
        Vector bVector = new Vector();


        new T_1("first",  aVector).start();
        new T_1("second", bVector).start();
        new T_1("last",   bVector).start();
    }
}