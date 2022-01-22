import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards = new ArrayList<>();

    public void add(Card card) {
        cards.add(card);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void sortBySuit() {
        Collections.sort(cards,new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand o) {
        int thisValue = this.cards.stream()
                .map(Card::getValue)
                .reduce(0, Integer::sum);
        int oValue = o.cards.stream()
                .map(Card::getValue)
                .reduce(0, Integer::sum);
        return thisValue - oValue;
    }
}
