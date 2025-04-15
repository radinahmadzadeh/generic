package products;

public class Accessory extends Product {
    private String color;

    private static int count = 1;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        this.color = color;
    }

    @Override
    protected String generateId() {
        return "3" + String.format("%03d", count++);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Color: " + color;
    }
}
