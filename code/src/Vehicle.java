import metadata.VehicleStatus;

public abstract class Vehicle {
    private String licenseNumber, stockNumber, barcode, model, make;
    private int passengerCapacity, manufacturingYear, mileage;
    private boolean hasSunroof;
    private VehicleStatus status;
    private List<VehicleLog> log;

    public boolean reserveVehicle();
    public boolean returnVehicle();


    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getStockNumber() {
        return stockNumber;
    }
    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getBarcode() {
        return barcode;
    }
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }
    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }
    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public VehicleStatus getStatus() {
        return status;
    }
    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public List<VehicleLog> getLog() {
        return log;
    }
    public void setLog(List<VehicleLog> log) {
        this.log = log;
    }
}