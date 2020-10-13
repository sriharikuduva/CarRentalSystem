import java.util.List;

public class CarRentalSystem {
    private String name;
    private List<CarRentalLocation> locations;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<CarRentalLocation> getLocations() {
        return locations;
    }
    public void setLocations(List<CarRentalLocation> locations) {
        this.locations = locations;
    }
}