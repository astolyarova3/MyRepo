import java.io.Serializable;

// Define the ElectricalAppliance class
class ElectricalAppliance implements Serializable {
    private String name;
    private double powerConsumption; // in watts

    public ElectricalAppliance(String name, double powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public String toString() {
        return "Appliance: " + name + ", Power Consumption: " + powerConsumption + " watts";
    }
}