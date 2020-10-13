import metadata.CarType;

public class Car extends Vehicle {
    private CarType type;

    public CarType getType() {
        return type;
    }
    public void setType(CarType type) {
        this.type = type;
    }
}