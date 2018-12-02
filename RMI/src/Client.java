import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class Client {
    public static void main(String[] args) throws Exception {
        AddI obj = (AddI) Naming.lookup ( "ADD");
        int n = obj.add(5,4);
        System.out.println ("Add is: " +n );
    }
}
