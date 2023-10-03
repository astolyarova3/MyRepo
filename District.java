import java.util.ArrayList;
import java.util.List;

public class District {
    private String name;
    private int population;

    public District(String name, int population) {
        this.name = name;
        this.population = population;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}