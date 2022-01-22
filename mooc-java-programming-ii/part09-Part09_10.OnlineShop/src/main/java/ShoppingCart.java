import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> products = new HashMap<>();

    public void add(String product, int price) {
        if (this.products.containsKey(product))
            this.products.get(product).increaseQuantity();
        else
            this.products.put(product, new Item(product,1,price));
    }

    public int price() {
        int totalPrice = 0;
        for (Item item :
                this.products.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item :
                products.values()) {
            System.out.println(item);
        }
    }
}
