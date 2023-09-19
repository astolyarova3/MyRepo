import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ElectricalApplianceDeserializationDemo {
    public static void main(String[] args) {
        // Deserialize the list of appliances
        try (FileInputStream fileIn = new FileInputStream("appliances.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            List<ElectricalAppliance> loadedAppliances = (List<ElectricalAppliance>) objectIn.readObject();
            System.out.println("Appliances deserialized from appliances.ser");

            // Calculate total power consumption
            double totalPowerConsumption = 0;
            for (ElectricalAppliance appliance : loadedAppliances) {
                totalPowerConsumption += appliance.getPowerConsumption();
            }

            System.out.println("Total Power Consumption: " + totalPowerConsumption + " watts");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}