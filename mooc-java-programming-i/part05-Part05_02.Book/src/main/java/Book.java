public class Book {
    private String title;
    private String author;
    private int pageCount;

    public Book(String author, String title, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getName() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pageCount;
    }

    public String toString() {
        return this.author + ", " + this.title + ", " + this.pageCount + " pages";
    }
}
