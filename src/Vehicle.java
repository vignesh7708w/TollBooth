public class Vehicle {

    private String registrationNumber;
    private VehicleType type;
    private String ownerName;

    public Vehicle(String registrationNumber, String ownerName, VehicleType type) {
        this.registrationNumber = registrationNumber;
        this.type = type;
        this.ownerName = ownerName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

}
