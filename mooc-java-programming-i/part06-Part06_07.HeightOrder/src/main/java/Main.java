import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        ArrayList<Person> people = room.getPersons();
        for (Person person :
                people) {
            System.out.println(person.getName());
        }

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }
}
