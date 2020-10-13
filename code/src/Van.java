import metadata.VanType;

public class Van extends Vehicle {
    private VanType type;

    public VanType getType() {
        return type;
    }
    public void setType(VanType type) {
        this.type = type;
    }
}