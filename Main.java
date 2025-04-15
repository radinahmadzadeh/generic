import inventory.*;
import products.*;

public class Main {
    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double sum = 0;
        for (Product p : inventory.getItems()) {
            sum += p.getPrice();
        }
        return sum;
    }
    public static void main(String[] args) {
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Notebook> notebookInventory = new Inventory<>();
        Inventory<Accessory> accessoryInventory = new Inventory<>();

        bookInventory.addItems(new Book("Java", 150.0, "ali", "java", "programming"));
        bookInventory.addItems(new Book("math", 120.0, "mmd", "ta", "education"));

        notebookInventory.addItems(new Notebook("student notebook", 30.0, 200, true));
        notebookInventory.addItems(new Notebook("sketch book", 40.0, 100, false));

        accessoryInventory.addItems(new Accessory("pen", 5.0, "black"));
        accessoryInventory.addItems(new Accessory("eraser", 3.0, "white"));

        System.out.println("Books:");
        bookInventory.displayAll();
        System.out.println("\nNotebooks:");
        notebookInventory.displayAll();
        System.out.println("\nAccessories:");
        accessoryInventory.displayAll();

        bookInventory.removeItemsById(101);
        accessoryInventory.removeItemsById(301);

        System.out.println("\nTotal Price of Notebooks: " +
                calculateTotalPrice(notebookInventory));

        System.out.println("\nFind Book ID 102:");
        System.out.println(bookInventory.findItemsById(102));

        System.out.println("\nFind Accessory ID 302:");
        System.out.println(accessoryInventory.findItemsById(302));

        notebookInventory.applyDiscount("sketch Book", 10);
        accessoryInventory.applyDiscount("eraser", 50);

        System.out.println("\nUpdated Notebooks:");
        notebookInventory.displayAll();

        System.out.println("\nUpdated Accessories:");
        accessoryInventory.displayAll();
    }
}
