package inventory;

import products.*;
import java.util.*;

public class Inventory<T extends Product> {
    private ArrayList<T> items = new ArrayList<>();

    public ArrayList<T> getItems() {
        return items;
    }

    public void addItems(T product) {
        items.add(product);
    }

    public void removeItemsById(int id) {
        items.removeIf(item -> item.getId().equals(String.valueOf(id)));
    }

    public T findItemsById(int id) {
        for (T item : items) {
            if (item.getId().equals(String.valueOf(id))) {
                return item;
            }
        }
        System.out.println("Item with ID " + id + " not found.");
        return null;
    }

    public void applyDiscount(String productName, int discount) {
        for (T item : items) {
            if (item.getTitle().equalsIgnoreCase(productName)) {
                double newPrice = item.getPrice() * (1 - discount / 100.0);
                item.setPrice(newPrice);
            }
        }
    }

    public void displayAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
