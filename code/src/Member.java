public class Member extends Account {
    private int totalVehiclesReserved;
    private List<VehicleReservation> reservations;

    public int getTotalVehiclesReserved() {
        return totalVehiclesReserved;
    }
    public void setTotalVehiclesReserved(int totalVehiclesReserved) {
        this.totalVehiclesReserved = totalVehiclesReserved;
    }

    public List<VehicleReservation> getReservations() {
        return reservations;
    }
    public void setReservations(List<VehicleReservation> reservations) {
        this.reservations = reservations;
    }
}
