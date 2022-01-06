import java.util.Objects;

public class Book {
    private String name;
    private String identifier;

    public Book (String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(identifier, book.identifier);
    }

    public String getName() {
        return this.name;
    }

    public String getIdentifier() {
        return this.identifier;
    }
}
