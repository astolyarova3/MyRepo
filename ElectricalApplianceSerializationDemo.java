import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ElectricalApplianceSerializationDemo {
    public static void main(String[] args) {
        // Create several electrical appliance objects
        ElectricalAppliance fridge = new ElectricalAppliance("Refrigerator", 150);
        ElectricalAppliance microwave = new ElectricalAppliance("Microwave", 1000);
        ElectricalAppliance laptop = new ElectricalAppliance("Laptop", 75);

        // Create a list of appliances
        List<ElectricalAppliance> appliances = new ArrayList<>();
        appliances.add(fridge);
        appliances.add(microwave);
        appliances.add(laptop);

        // Serialize the list of appliances
        try (FileOutputStream fileOut = new FileOutputStream("appliances.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(appliances);
            System.out.println("Appliances serialized to appliances.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}