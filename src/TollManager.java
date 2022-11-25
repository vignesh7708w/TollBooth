import java.util.HashMap;
import java.util.Map;

public class TollManager {

    static Map<String, TollEntity> cache = new HashMap<String, TollEntity>();
    public static void main(String[] args){
        // Sample Entries
        // Car entry at 1st toll
        entryToll("DL12CD3456", "John", VehicleType.CAR, 1);
        // Car entry at 2nd toll
        entryToll("TN12BX3456", "Adam", VehicleType.CAR, 2);
        // Bike entry at 2nd toll
        entryToll("TN12BX3456", "Adam", VehicleType.BIKE, 2);

        // Sample Exit
        // Exit first car at 5th toll
        int cost = exitToll("DL12CD3456", 5);
        System.out.println(cost);
        // Exit bike at 6th toll
        int bikecost = exitToll("TN12BX3456", 6);
        System.out.println(bikecost);
    }

    public static void entryToll(String registrationNumber, String ownerName, VehicleType vehicleType, int entryTollPosition){
        Vehicle firstCar = new Vehicle(registrationNumber, ownerName, vehicleType);
        TollEntity tollEntity = new TollEntity(firstCar, entryTollPosition);
        cache.put(registrationNumber, tollEntity);
    }

    public static int exitToll(String registrationNumber, int exitTollPosition){
        TollEntity tollEntity = cache.get(registrationNumber);
        tollEntity.setExitTollPosition(exitTollPosition);
        cache.remove(registrationNumber);
        return tollEntity.getCost();
    }

}
