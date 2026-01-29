import java.util.TreeSet;

public class MainBai7 {
    public static void main(String[] args) {
        TreeSetDemo demo = new TreeSetDemo();
        TreeSet<String> names = demo.getNames();

        System.out.println("Danh sách TreeSet: " + names);
        System.out.println("Phần tử đầu tiên: " + names.first());
        System.out.println("Phần tử cuối cùng: " + names.last());
    }
}
