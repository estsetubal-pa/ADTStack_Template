package pt.pa.adts;


public class StackLinkedList<T> implements Stack<T> {

    private Node top; //sentinel of linked list
    private int size;

    public StackLinkedList() {
        /*
        The configuration of an empty singly linked list is the sentinel
        pointing to null.
         */
        this.top = new Node(null, null);
        this.size = 0;
    }

    @Override
    public void push(T element) throws FullStackException {
        /*
        Element should be stored in a new node which is pointed by top sentinel.
        Must maintain the chaining of all nodes.
         */
        throw new UnsupportedOperationException("This method is not implemented yet.");
    }

    @Override
    public T pop() throws EmptyStackException {
        /*
        The element at the top of the stack is the element stored in the
        node immediately after the top sentinel.
         */
     throw new UnsupportedOperationException("This method is not implemented yet.");
    }

    @Override
    public T peek() throws EmptyStackException {
     throw new UnsupportedOperationException("This method is not implemented yet.");
    }

    @Override
    public int size() {
      throw new UnsupportedOperationException("This method is not implemented yet.");
    }

    @Override
    public boolean isEmpty() {
   throw new UnsupportedOperationException("This method is not implemented yet.");
    }

    @Override
    public void clear() {
       throw new UnsupportedOperationException("This method is not implemented yet.");
    }

    /**
     * Inner class representing a linked list node.
     * Only recognized in the context of this class (private).
     */
    private class Node {
        private T element;
        private Node next;

        public Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
