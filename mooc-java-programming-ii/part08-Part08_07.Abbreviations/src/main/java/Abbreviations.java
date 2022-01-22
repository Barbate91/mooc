import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreves = new HashMap<>();

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitize(abbreviation);
        abbreves.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sanitize(abbreviation);
        if (abbreves.containsKey(abbreviation))
            return true;
        else
            return false;
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitize(abbreviation);
        return abbreves.get(abbreviation);
    }

    private String sanitize(String input) {
        if (input == null)
            return "";
        input = input.toLowerCase();
        return input.trim();
    }
}
