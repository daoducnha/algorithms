package chap1_3;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<Item> implements Iterable<Item> {
    public Bag() {
    }

    ;

    void add(Item item) {
    }

    boolean isEmpty() {
        return true;
    }

    int size() {
        return 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }
}
