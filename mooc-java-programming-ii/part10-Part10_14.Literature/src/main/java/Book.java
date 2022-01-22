public class Book {
    private String name;
    private int ageRecom;

    public Book(String name, int ageRecom) {
        this.name = name;
        this.ageRecom = ageRecom;
    }

    public int getAgeRecommendation() {
        return this.ageRecom;
    }

    public String getName() {
        return this.name;
    }
}
