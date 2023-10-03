import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Получение доступа к регистру RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Получение удаленного объекта из регистра по его имени
            MyRemoteInterface remoteObject = (MyRemoteInterface) registry.lookup("MyRemoteServer");

            // Создание объекта, который будет передан как параметр
            MyObject obj = new MyObject();

            // Вызов удаленного метода и передача объекта в качестве параметра
            remoteObject.remoteMethod(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}