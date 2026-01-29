
import java.util.ArrayList;

public class MainBai4 {
    public static void main(String[] args) {
        FruitList fl = new FruitList();
        ArrayList<String> fruits = fl.getFruits();
        System.out.println("Danh sách quả: " + fruits);
        if (fruits.contains("Apple")) {
            System.out.println("Apple tồn tại trong danh sách.");
        } else {
            System.out.println("Apple không tồn tại trong danh sách.");
        }
    }
}
