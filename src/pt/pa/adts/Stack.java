package pt.pa.adts;

public interface Stack<T>  {
    public void push(T element) throws FullStackException;
    public T pop() throws EmptyStackException;
    public T peek() throws EmptyStackException;

    public int size();
    public boolean isEmpty();
    public void clear();
}