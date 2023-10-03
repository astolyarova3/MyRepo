import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class DistrictSerializationDemo {
    public static void main(String args) {
        // Create several district objects
        District district1 = new District("Downtown", 50000);
        District district2 = new District("Suburb A", 30000);
        District district3 = new District("Suburb B", 25000);

        // Serialize the district objects
        try (FileOutputStream fileOut1 = new FileOutputStream("district1.ser");
             ObjectOutputStream objectOut1 = new ObjectOutputStream(fileOut1);
             FileOutputStream fileOut2 = new FileOutputStream("district2.ser");
             ObjectOutputStream objectOut2 = new ObjectOutputStream(fileOut2);
             FileOutputStream fileOut3 = new FileOutputStream("district3.ser");
             ObjectOutputStream objectOut3 = new ObjectOutputStream(fileOut3)) {

            objectOut1.writeObject(district1);
            objectOut2.writeObject(district2);
            objectOut3.writeObject(district3);
            System.out.println("District objects serialized");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}