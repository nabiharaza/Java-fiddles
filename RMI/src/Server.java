
import java.net.MalformedURLException;
import java.rmi.*;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        AddC obj = new AddC ();
        Naming.rebind ( "ADD",obj );
        System.out.println ("Server Started" );
    }
}
