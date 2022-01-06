public class Book {
    private String title;
    private int pages;
    private int pubYear;

    public Book(String title, int pages, int pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }

    public String toString() {
        return title + ", " + pages + " pages, " + pubYear;
    }

    public String getName() {
        return this.title;
    }
}
