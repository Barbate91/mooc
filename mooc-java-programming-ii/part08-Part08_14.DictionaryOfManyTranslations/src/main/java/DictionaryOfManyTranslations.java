import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

    public void add(String word, String translation) {
        String sWord = sanitize(word);
        String sTranslation = sanitize(translation);
        this.dictionary.putIfAbsent(sWord, new ArrayList<>());
        ArrayList<String> translationsForWord = this.dictionary.get(sWord);
        if (!translationsForWord.contains(sTranslation))
            translationsForWord.add(sTranslation);
    }

    public ArrayList<String> translate(String word) {
        String sWord = sanitize(word);
        if (this.dictionary.containsKey(sWord)) {
            return this.dictionary.get(sWord);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String word) {
        String sWord = sanitize(word);
        if (this.dictionary.containsKey(sWord))
            this.dictionary.remove(sWord);
    }

    public String sanitize(String word) {
        return word.toLowerCase().trim();
    }


}
