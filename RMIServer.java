import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Создание RMI-сервера
            MyRemoteServer server = new MyRemoteServer();

            // Создание регистра RMI, который будет слушать порт 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Регистрация RMI-сервера в регистре
            registry.rebind("MyRemoteServer", server);

            System.out.println("RMI сервер запущен");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}