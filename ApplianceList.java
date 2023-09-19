import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ApplianceList {
    private List<ElectricalAppliance> appliances;

    public ApplianceList() {
        appliances = new ArrayList<>();
    }

    public void addAppliance(ElectricalAppliance appliance) {
        appliances.add(appliance);
    }

    public void serialize(String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(appliances);
            System.out.println("Appliances serialized to " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}