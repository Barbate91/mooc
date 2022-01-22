
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.isEmpty())
                break;
            System.out.print("Input the age recommendation: ");
            int ageRecom = Integer.parseInt(scanner.nextLine());
            books.add(new Book(bookName,ageRecom));
        }
        System.out.println(books.size() + " books in total.");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                        .thenComparing(Book::getName);

        Collections.sort(books,comparator);

        System.out.println("Books:");
        for (Book book :
                books) {
            System.out.println(book.getName() + " (recommends for " + book.getAgeRecommendation() + " year-olds or older)");
        }
    }

}
