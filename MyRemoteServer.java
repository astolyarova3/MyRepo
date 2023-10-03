import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteServer extends UnicastRemoteObject implements MyRemoteInterface {
    protected MyRemoteServer() throws RemoteException {
        super();
    }

    @Override
    public void remoteMethod(MyObject obj) throws RemoteException {
        // ваши действия с полученным объектом
    }
}