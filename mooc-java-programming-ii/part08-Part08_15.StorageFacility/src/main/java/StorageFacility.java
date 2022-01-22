import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageFacility = new HashMap<>();

    public void add(String unit, String item) {
        if (sanitizeAndContainsKey(unit)) {
            this.storageFacility.get(sanitize(unit)).add(item);
        } else {
            this.storageFacility.put(sanitize(unit),new ArrayList<>(Collections.singletonList(item)));
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (sanitizeAndContainsKey(storageUnit)) {
            return this.storageFacility.get(sanitize(storageUnit));
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String storageUnit, String item) {
        if (sanitizeAndContainsKey(storageUnit)) {
            ArrayList<String> items = this.storageFacility.get(sanitize(storageUnit));
            items.remove(item);
            if (items.isEmpty())
                this.storageFacility.remove(sanitize(storageUnit));
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        for (String unit :
                this.storageFacility.keySet()) {
            if (!this.storageFacility.get(unit).isEmpty())
                storageUnits.add(unit);
        }
        return storageUnits;
    }

    public boolean sanitizeAndContainsKey(String keyword) {
        String sanitizedWord = sanitize(keyword);
        return this.storageFacility.containsKey(sanitizedWord);
    }

    public String sanitize(String word) {
        return word.toLowerCase().trim();
    }
}
