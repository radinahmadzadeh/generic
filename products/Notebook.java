package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;

    private static int count = 1;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    @Override
    protected String generateId() {
        return "2" + String.format("%03d", count++);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Page Count: " + pageCount +
                ", Hard Cover: " + (isHardCover ? "Yes" : "No");
    }
}
