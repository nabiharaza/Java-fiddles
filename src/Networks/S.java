package Networks;

public class S extends Thread {
	protected int n;

	public S (int n) {
		this.n = n;
	}

	public synchronized void P () {
		if (n <= 0) {
			try {
				wait();		// see in object
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		-- n;
	}

	public synchronized void V () {
		if (++ n > 0)
			notify();		// see in object
	}

	public  void run() {
		for ( int i = n; i >= 0; i -- )	{
			System.out.println("i = " + i);
			System.out.println("before P ");
			P();
			System.out.println("after P ");
		}
	}
	static public void main(String args[] )	{
		S aS1 = new S(3);
		aS1.start();
		try {
			System.out.println("\tsleeping ...");
			sleep(1000);
			System.out.println("\tbefore V ");
			aS1.V();
			System.out.println("\tafter V ");
		}
		catch (  InterruptedException e ) {
			System.err.println("\tInterrupted!");
		}
	}
}