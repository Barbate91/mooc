import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Item> products = new HashMap<>();
    private Map<String, Integer> unusedMap = new HashMap<>();

    public void addProduct(String product, int price, int stock) {
        products.put(product, new Item(product,stock,price));
    }

    public int price(String product) {
        if (products.containsKey(product))
            return products.get(product).getPrice();
        else
            return -99;
    }

    public int stock(String product) {
        if (products.containsKey(product)) {
            return products.get(product).getQty();
        } else
            return 0;
    }

    public boolean take(String product) {
        if (products.containsKey(product)) {
            return products.get(product).take();
        } else
            return false;
    }

    public Set<String> products() {
        return products.keySet();
    }
}
