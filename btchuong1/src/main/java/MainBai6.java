import java.util.HashSet;

public class MainBai6 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 2, 5, 8, 1};
        UniqueSet us = new UniqueSet();
        HashSet<Integer> set = us.getUnique(numbers);

        System.out.println("Các phần tử duy nhất: " + set);

        // HashSet không giữ thứ tự ban đầu vì dùng hash table để lưu trữ.
        // Do đó thứ tự in ra có thể khác mảng gốc.
    }
}
