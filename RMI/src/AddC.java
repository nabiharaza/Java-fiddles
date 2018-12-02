import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddC extends UnicastRemoteObject implements AddI{


    protected AddC() throws RemoteException {
        super();

    }

    @Override
    public String add(int x, int y) throws Exception {

        return "Nabiha's Mac "+x+y;
    }
}
