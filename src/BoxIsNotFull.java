public class BoxIsNotFull extends RuntimeException{
    public BoxIsNotFull(int moreItems) {
        super("Коробка не полна. Осталось заполнить " + moreItems + " ячейки");
    }
}