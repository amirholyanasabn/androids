public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();
        stringBox.add("Majid");
        System.out.println(stringBox.get());
        integerBox.add(20);
        System.out.println(integerBox.get());
    }
}
