import java.util.ArrayList;
import java.util.List;

public class City {
    private List<District> districts;

    public City() {
        districts = new ArrayList<>();
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

    // Getters and setters

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}