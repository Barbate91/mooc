import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> vehicleRegistry = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        if (vehicleRegistry.containsKey(licensePlate) && !(vehicleRegistry.get(licensePlate).isEmpty()))
            return false;

        vehicleRegistry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (vehicleRegistry.containsKey(licensePlate))
            return vehicleRegistry.get(licensePlate);
        else
            return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehicleRegistry.containsKey(licensePlate)) {
            vehicleRegistry.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate :
                vehicleRegistry.keySet()) {
            System.out.println(licensePlate.toString());
        }
    }

    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();
        for (String owner :
                vehicleRegistry.values()) {
            if (!(printed.contains(owner))) {
                System.out.println(owner);
                printed.add(owner);
            }
        }
    }
}
