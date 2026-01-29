public class MainBai1 {
    public static void main(String[] args) {
        Test<Integer> intTest = new Test<>();
        intTest.set(100);
        System.out.println("Integer value: " + intTest.get());

        Test<String> strTest = new Test<>();
        strTest.set("Hello Generics");
        System.out.println("String value: " + strTest.get());
    }
}
