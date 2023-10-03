import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CityDeserializationDemo {
    public static void main(String[] args) {
        // Deserialize the city object
        try (FileInputStream fileIn = new FileInputStream("city.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            City loadedCity = (City) objectIn.readObject();
            System.out.println("City object deserialized from city.ser");

            // Verify the deserialized city
            System.out.println("Districts in the loaded city:");
            for (District district : loadedCity.getDistricts()) {
                System.out.println(district);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}