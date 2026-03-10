import java.util.TreeSet;
public class Bai1_TreeSet {
    public static void main(String[] arg) {
        TreeSet<String> nameSet = new TreeSet<>();
        nameSet.add("John");
        nameSet.add("Alice");
        nameSet.add("Zack");
        nameSet.add("Bob");
        
        System.out.print("BÀI 1 - TREESET");
        System.out.print("Danh Sách tên:" + nameSet);
        String firstElement = nameSet.first();
        String lastElement = nameSet.last();
        System.out.println("Phần tử đầu tiên (first): " + firstElement);
        System.out.println("Phần tử cuối cùng (last): " + lastElement);
    }
}