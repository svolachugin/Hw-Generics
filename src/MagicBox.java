import java.util.Random;

public class MagicBox<T> {
    protected int numberOfItems; //количество объектов, которые можно положить в коробку
    protected T[] items; //массив объектов
    protected int count; //счетчик заполнения коробки
    protected Random random = new Random(); //случайный объект из коробки

    public MagicBox(int numberOfItems) {
        this.numberOfItems = numberOfItems;
        items = (T[]) new Object[numberOfItems];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                count += 1;
                System.out.println("Добавляем " + item);
                return true;
            }
        }
        System.out.println(item + " добавить нельзя. Коробка переполнена!");
        return false;
    }

    public T pick() {
        if (items[numberOfItems - 1] != null) {
            int randomItem = random.nextInt(numberOfItems);
            System.out.println("Случайный элемент из коробки, это - " + items[randomItem]);
            return items[randomItem];
        }
        int moreItems = items.length - count;
        throw new BoxIsNotFull(moreItems);
    }
}
