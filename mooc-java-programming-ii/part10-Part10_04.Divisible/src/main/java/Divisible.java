
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        Predicate<Integer> div2 = i -> i%2==0;
        Predicate<Integer> div3 = i -> i%3==0;
        Predicate<Integer> div5 = i -> i%5==0;

        ArrayList<Integer> getDivisibles = numbers.stream()
                .filter(div2.or(div3).or(div5))
                .collect(Collectors.toCollection(ArrayList::new));
        return getDivisibles;
    }

}
