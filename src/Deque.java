public interface Deque<T> {
    void addFirst(T item);

    void addLast(T item);

    boolean isEmpty();

    int size();

    void printDeque();

    T removeFirst();

    T removeLast();

    T get(int index);

    default void asd() {
        printDeque();
    }

    default void asd2() {
        printDeque();
    }
}
