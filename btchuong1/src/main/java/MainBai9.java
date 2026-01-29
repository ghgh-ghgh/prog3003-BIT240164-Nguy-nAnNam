import java.util.TreeMap;
import java.util.SortedMap;

public class MainBai9 {
    public static void main(String[] args) {
        ProductMap pm = new ProductMap();
        TreeMap<String, Double> products = pm.getProducts();

        System.out.println("Danh sách sản phẩm: " + products);

        // Lấy subMap từ "K" đến "M"
        SortedMap<String, Double> sub = products.subMap("K", "M");
        System.out.println("Các sản phẩm từ K đến M: " + sub);
    }
}
