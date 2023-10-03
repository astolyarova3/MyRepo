import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CitySerializationDemo {
    public static void main(String args) {
        // Create several district objects
        District district1 = new District("Downtown", 50000);
        District district2 = new District("Suburb A", 30000);
        District district3 = new District("Suburb B", 25000);

        // Create a city and add districts to it
        City myCity = new City();
        myCity.addDistrict(district1);
        myCity.addDistrict(district2);
        myCity.addDistrict(district3);

        // Serialize the city object
        try (FileOutputStream fileOut = new FileOutputStream("city.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(myCity);
            System.out.println("City object serialized to city.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}