public class Nev<Item> extends ArrayDeque<Item> {
    Deque<Item> Lost;

    public Nev(Item inti) {
        super(inti);
        Lost = new ArrayDeque<>();
    }

    public Nev() {
        Lost = new ArrayDeque<>();
    }

    public static void main(String[] args) {
        Nev<String> we = new Nev<>("qwe");
        we.addLast("l");
        we.addLast("y");
        we.addLast("y");
        we.addLast("y");
        we.rotateRight();
        we.printDeque();
        we.removeLast();
        we.printLostItems();
    }

    @Override
    public Item removeLast() {
        Item c = super.removeLast();
        Lost.addLast(c);
        return c;
    }

    public void rotateRight() {
        Item x = super.removeLast();
        addFirst(x);
    }

    public void printLostItems() {
        Lost.printDeque();
    }
}
