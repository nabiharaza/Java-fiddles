
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Client {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry ("127.0.0.1", 2211);
        AddI obj = (AddI) registry.lookup ( "ADD");
        String n = obj.add(5,4);
        System.out.println ("Add is: " +n );
    }
}
