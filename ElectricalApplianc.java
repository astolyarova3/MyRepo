public class ElectricalAppliance implements Serializable {
    private String name;
    private double powerConsumption;

    public ElectricalAppliance(String name, double powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public String getName() {
        return name;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Power Consumption: " + powerConsumption;
    }
}