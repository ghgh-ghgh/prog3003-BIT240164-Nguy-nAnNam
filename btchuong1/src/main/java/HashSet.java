import java.util.HashSet;

class UniqueSet {
    public HashSet<Integer> getUnique(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            set.add(num);
        }
        return set;
    }
}
