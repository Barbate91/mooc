package application;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataIngester {
    private Scanner scanner;
    private Map<Integer,Integer> ranksByDate = new HashMap<>();

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
            String[] splitRow = row.split(" ");
            ranksByDate.put(Integer.parseInt(splitRow[0]),Integer.parseInt(splitRow[1]));
        }
    }

    public Map<Integer,Integer> getData() {
        return ranksByDate;
    }
}
