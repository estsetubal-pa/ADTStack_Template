package pt.pa.adts;

package pt.pa.adts;

/**
 * The Stack interface defines the contract for an Abstract Data Type (ADT) Stack.
 * A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle:
 * the last element inserted is the first one to be removed.
 *
 * This interface is generic, allowing the stack to store elements of any type <T>.
 */
public interface Stack<T>  {

    /**
     * Inserts (pushes) an element onto the top of the stack.
     *
     * @param element the element to be added
     * @throws FullStackException if the stack has a fixed capacity and is already full
     */
    public void push(T element) throws FullStackException;

    /**
     * Removes (pops) the element from the top of the stack and returns it.
     *
     * @return the element removed from the top
     * @throws EmptyStackException if the stack is empty and no element can be removed
     */
    public T pop() throws EmptyStackException;

    /**
     * Returns (peeks) the element at the top of the stack without removing it.
     *
     * @return the element currently at the top
     * @throws EmptyStackException if the stack is empty
     */
    public T peek() throws EmptyStackException;

    /**
     * Returns the number of elements currently stored in the stack.
     *
     * @return the current size of the stack
     */
    public int size();

    /**
     * Checks whether the stack is empty.
     *
     * @return true if the stack contains no elements, false otherwise
     */
    public boolean isEmpty();

    /**
     * Removes all elements from the stack, resetting it to an empty state.
     */
    public void clear();
}
