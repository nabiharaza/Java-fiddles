
import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        AddC obj = new AddC ();
        Registry registry = LocateRegistry.createRegistry ( 2211 );
        registry.rebind ( "ADD",obj );
        System.out.println ("Nabiha's Server Started" );

    }
}
