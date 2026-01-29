import java.util.TreeMap;
import java.util.SortedMap;

class ProductMap {
    public TreeMap<String, Double> getProducts() {
        TreeMap<String, Double> products = new TreeMap<>();
        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);
        return products;
    }
}
