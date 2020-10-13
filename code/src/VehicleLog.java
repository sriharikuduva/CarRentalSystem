import metadata.VehicleLogType;

import java.util.List;

public class VehicleLog {
    private String id, creationDate;
    private VehicleLogType type;
    private String description;

    public boolean update();

    public List<VehicleLogType> searchByLogType(VehicleLogType type);

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public VehicleLogType getType() {
        return type;
    }
    public void setType(VehicleLogType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}