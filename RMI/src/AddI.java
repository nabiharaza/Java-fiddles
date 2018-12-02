import java.rmi.Remote;

public interface AddI extends Remote {
    public String add (int x, int y) throws Exception;

}


