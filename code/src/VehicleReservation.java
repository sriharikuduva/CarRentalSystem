import metadata.ReservationStatus;

import java.util.Date;
import java.util.List;

public class VehicleReservation {
    private String reservationNumber;
    private Date creationDate;
    private ReservationStatus status;
    private Date dueDate;
    private Date returnDate;
    private String pickupLocationName;
    private String returnLocationName;

    private int customerID;
    private Vehicle vehicle;
    private Bill bill;
    private List<AdditionalDriver> additionalDrivers;
    private List<Notification> notifications;
    private List<RentalInsurance> insurances;
    private List<Equipment> equipments;
    private List<Service> services;

    public static VehicleReservation fetchReservationDetails(String reservationNumber);

    public String getReservationNumber() {
        return reservationNumber;
    }
    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public ReservationStatus getStatus() {
        return status;
    }
    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getPickupLocationName() {
        return pickupLocationName;
    }
    public void setPickupLocationName(String pickupLocationName) {
        this.pickupLocationName = pickupLocationName;
    }

    public String getReturnLocationName() {
        return returnLocationName;
    }
    public void setReturnLocationName(String returnLocationName) {
        this.returnLocationName = returnLocationName;
    }

    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Bill getBill() {
        return bill;
    }
    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public void setAdditionalDrivers(List<AdditionalDriver> additionalDrivers) {
        this.additionalDrivers = additionalDrivers;
    }
    public List<AdditionalDriver> getAdditionalDrivers() {
        return additionalDrivers;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public List<RentalInsurance> getInsurances() {
        return insurances;
    }
    public void setInsurances(List<RentalInsurance> insurances) {
        this.insurances = insurances;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }
    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    public List<Service> getServices() {
        return services;
    }
    public void setServices(List<Service> services) {
        this.services = services;
    }
}