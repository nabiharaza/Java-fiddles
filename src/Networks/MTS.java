package Networks;// java MTS

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class MTS extends Thread {

    ServerSocket listen;
    static String hostName = "spiegel.cs.rit.edu";
    int port = 4242;
    int id = 0;

    public MTS() {
        listen = null;
    }

    public MTS(int port) {
        try {
            listen = new ServerSocket ( port );
            System.out.println ( "Listening on port: " + getLocalPort ( ) );
        } catch (Exception e) {
            System.out.println ( e );
        }
    }

    public MTS(int port, int id) {
        this ( port );
        this.id = id;
    }

    public int getLocalPort() {
        return listen.getLocalPort ( );
    }

    private void printMessage() {
        System.out.println ( "-h		---->	help" );
        System.out.println ( "[-host 		hostName" );
        System.out.println ( " -port 		port" );
        System.out.println ( " {-port 		port}" );
        System.out.println ( "or " );
        System.out.println ( " no argument" );
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
            else if (args[i].equals ( "-port" )) {
                port = new Integer ( args[++i] ).intValue ( );
                new MTS ( port ).listenToPort ( );
            }
        }
    }

    public void run() {
        try {
            System.out.println ( "Wating for client to connect " + listen );
            Socket clientConnection = listen.accept ( );
            System.out.println ( clientConnection.toString ( ) );
            PrintWriter out = new PrintWriter ( clientConnection.getOutputStream ( ), true );
            out.println ( "It is now: " + new Date ( ) );
            System.out.println ( id + " .... falling asleep" );
            sleep ( 1000 );
            System.out.println ( "\t" + id + " .... wake up" );
            listen.close ( );
        } catch (Exception e) {
            System.out.println ( e );
            e.printStackTrace ( );
        }
    }

    public void listenToPort() {
        try {
            int id = 0;
            System.out.println ( "Wating for client to connect " + listen );
            Socket clientConnection = listen.accept ( );
            System.out.println ( "Somebody connected ... " );
            for (; ; ) {


                BufferedReader dataStreamIn = new BufferedReader (
                        new InputStreamReader ( clientConnection.getInputStream ( ) ) );
                String MessageFromClient = dataStreamIn.readLine ( );
                System.out.println ( "Message From Client" + MessageFromClient );
                PrintWriter out = new PrintWriter ( clientConnection.getOutputStream ( ), true );
                out.println ( Integer.parseInt ( MessageFromClient ) + 2 );


//                clientConnection.close ( );
            }
        } catch (Exception e) {
            System.out.println ( e );
            e.printStackTrace ( );
        }
    }

    public static void main(String argv[]) {
        if (argv.length == 0)
            new MTS ( 3033 ).listenToPort ( );
        else
            new MTS ( ).parseArgs ( argv );
    }
}