package products;

public class Book extends Product {
    private String author;
    private String publication;
    private String genre;

    private static int count = 1;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        this.author = author;
        this.publication = publication;
        this.genre = genre;
    }

    @Override
    protected String generateId() {
        return "1" + String.format("%03d", count++);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Author: " + author +
                ", Publication: " + publication +
                ", Genre: " + genre;
    }
}
