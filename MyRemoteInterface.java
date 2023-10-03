import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteInterface extends Remote {
    void remoteMethod(MyObject obj) throws RemoteException;
}