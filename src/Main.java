public class Main {
    public static void main(String[] args) {
        //магическая коробка для строк
        MagicBox<String> box1 = new MagicBox<>(3);
        System.out.println("Коробка №1 (String)");
        box1.add("Колбаса");
        box1.add("Хлеб");
        box1.add("Яблоки");
        box1.add("Сигареты");
        box1.pick();
        box1.pick();
        box1.pick();

        System.out.println();

        //магическая коробка для чисел
        MagicBox<Integer> box2 = new MagicBox<>(4);
        System.out.println("Коробка №2 (числа)");
        box2.add(2);
        box2.add(3);
        box2.add(5);
        box2.add(7);
        box2.add(11);
        box2.add(13);
        box2.pick();
        box2.pick();
        box2.pick();

        //проверка на обработку RuntimeException
        System.out.println();
        MagicBox<Integer> box3 = new MagicBox<>(3);
        System.out.println("\n   Коробка №3 (числа)");
        box3.add(1);
        box3.pick();
    }
}