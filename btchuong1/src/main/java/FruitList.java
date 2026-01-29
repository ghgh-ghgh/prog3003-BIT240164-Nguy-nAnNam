import java.util.ArrayList;

class FruitList {
    public ArrayList<String> getFruits() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.add(1, "Mango");
        fruits.set(fruits.indexOf("Banana"), "Grapes");

        return fruits;
    }
}
