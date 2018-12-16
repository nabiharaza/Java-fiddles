package Networks;// java MTSclient -host spiegel -port 50405

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MTSclient {

    String hostName = "0.0.0.0";
    int port = 59785;

    private void printMessage() {
        System.out.println ( "-h		---->	help" );
        System.out.println ( "[-host 		hostName]" );
        System.out.println ( "[-port 		port]" );
    }

    /**
     * Parse the commandlind arguments and sets variables.
     */
    public void parseArgs(String args[]) {

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals ( "-h" ))
                printMessage ( );
            else if (args[i].equals ( "-host" ))
                hostName = args[++i];
            else if (args[i].equals ( "-port" ))
                port = new Integer ( args[++i] ).intValue ( );
        }
    }

    public void doTheJob() {
        try {
            Socket socket = new Socket ( hostName, port );
            BufferedReader dataStreamIn = new BufferedReader (
                    new InputStreamReader ( socket.getInputStream ( ) ) );
            PrintWriter out = new PrintWriter ( socket.getOutputStream ( ),
                    true );
            out.println ( 0 );

            for (; ; ) {

                String MessageFromServer = dataStreamIn.readLine ( );
                System.out.println ( "Message from Server " + MessageFromServer );
                out.println ( Integer.parseInt ( MessageFromServer ) + 2 );
            }

        } catch (Exception e) {
            System.out.println ( e );
        }
    }

    public static void main(String argv[]) {
        MTSclient aMTSclient = new MTSclient ( );
        aMTSclient.parseArgs ( argv );
        aMTSclient.doTheJob ( );

    }
}