package pt.pa.adts;


public class StackArrayList<T> implements Stack<T> {

    private static final int DEFAULT_CAPACITY = 40;

    private T[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public StackArrayList() {
        this.elements = (T[])new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void push(T element) throws FullStackException {
        if(this.size >= this.elements.length) throw new FullStackException();

        this.elements[this.size++] = element;
    }

    @Override
    public T pop() throws EmptyStackException {
        if(this.size == 0) throw new EmptyStackException();

        T elem = this.elements[this.size - 1];
        this.elements[this.size - 1] = null; //Q: Strictly necessary? Why is it a good idea?
        this.size--;

        return elem;
    }

    @Override
    public T peek() throws EmptyStackException {
        throw new UnsupportedOperationException("This method is not implemented yet.");
}

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {

        throw new UnsupportedOperationException("This method is not implemented yet.");

    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("This method is not implemented yet.");
}

}
