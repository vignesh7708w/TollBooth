public class TollEntity {

    Vehicle vehicle;
    int entryTollPosition;
    int exitTollPosition;
    int distanceCovered = 0;

    public TollEntity(Vehicle vehicle, int entryTollPosition) {
        this.vehicle = vehicle;
        this.entryTollPosition = entryTollPosition;
    }

    public void setExitTollPosition(int exitTollPosition){
        this.exitTollPosition = exitTollPosition;
        distanceCovered = Math.abs(exitTollPosition - entryTollPosition);
    }

    public int getCost(){
        return distanceCovered * this.vehicle.getType().getCostPerToll();
    }
}
