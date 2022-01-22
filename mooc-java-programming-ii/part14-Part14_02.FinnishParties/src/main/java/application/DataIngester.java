package application;

import java.nio.file.Paths;
import java.util.*;

public class DataIngester {
    private Scanner scanner;
    private Map<String, ArrayList<Double>> partySupportOverTime = new HashMap<>();
    private List<Integer> years = new ArrayList<>();

    public DataIngester(String dataPath) {
        init(dataPath);
    }

    private void init(String dataPath) {
        try {
            scanner = new Scanner(Paths.get(dataPath));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        ingest();
    }

    private void ingest() {
        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            String[] splitRow = row.split("\t");

            if (splitRow[0].equals("Party")) {
                for (int i = 1; i < splitRow.length; i++) {
                    years.add(Integer.parseInt(splitRow[i]));
                }
            } else {
                ArrayList<Double> data = new ArrayList<>();
                for (int i = 1; i < splitRow.length; i++) {
                    if (!splitRow[i].equals("-")) {
                        data.add(Double.parseDouble(splitRow[i]));
                    } else {
                        data.add(-1.0);
                    }
                }
                partySupportOverTime.put(splitRow[0],data);
            }
        }
    }

    public Map<String, ArrayList<Double>> getPartyData() {
        return partySupportOverTime;
    }

    public List<Integer> getYears() {
        return years;
    }
}
