import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        }
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
