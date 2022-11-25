public enum VehicleType {

    CAR("Car", 10),
    BIKE("Bike", 5);

    private final String vehicleType;
    private final Integer costPerToll;

    VehicleType(String vehicleType, int costPerToll) {
        this.vehicleType = vehicleType;
        this.costPerToll = costPerToll;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Integer getCostPerToll() {
        return costPerToll;
    }

}
