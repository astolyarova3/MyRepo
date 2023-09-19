{public class ElectricalApplianceSerializationDemo {
    public static void main(String[] args) {
        // Create several electrical appliance objects
        ElectricalAppliance fridge = new ElectricalAppliance("Refrigerator", 150);
        ElectricalAppliance microwave = new ElectricalAppliance("Microwave", 1000);
        ElectricalAppliance laptop = new ElectricalAppliance("Laptop", 75);

        // Create an appliance list and add appliances to it
        ApplianceList applianceList = new ApplianceList();
        applianceList.addAppliance(fridge);
        applianceList.addAppliance(microwave);
        applianceList.addAppliance(laptop);

        // Serialize the list of appliances
        applianceList.serialize("appliances.ser");
    }
}
}
