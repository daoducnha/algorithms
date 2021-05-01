package chap1.chap1_3;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    private Node first;

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class Node {
        Item item;
        Node next;
    }

    void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    private class ListIterator implements Iterator<Item> {
        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
