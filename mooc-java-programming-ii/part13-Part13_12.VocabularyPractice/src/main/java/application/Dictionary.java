package application;

import java.util.*;

public class Dictionary {

    private List<String> words = new ArrayList<>();
    private Map<String,String> translations = new HashMap<>();

    public Dictionary() {
        this.words.add("default");
        this.translations.put("default","defaulto");
    }

    public String get(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.words.add(word);
        }
        this.translations.put(word,translation);
    }

    public String getRandomWord() {
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }
}
