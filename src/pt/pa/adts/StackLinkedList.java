package pt.pa.adts;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackLinkedList<T> implements Stack<T> {

    private Node top; //sentinel
    private int size;

    public StackLinkedList() {
        this.top = new Node(null, null);
        this.size = 0;
    }

    @Override
    public void push(T element) throws FullStackException {
        throw new NotImplementedException();
    }

    @Override
    public T pop() throws EmptyStackException {
        throw new NotImplementedException();
    }

    @Override
    public T peek() throws EmptyStackException {
        throw new NotImplementedException();
    }

    @Override
    public int size() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isEmpty() {
        throw new NotImplementedException();
    }

    @Override
    public void clear() {
        throw new NotImplementedException();
    }

    private class Node {
        private T element;
        private Node next;

        public Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
