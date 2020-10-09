package pt.pa.adts;

public class Main {

    public static void main(String[] args) {
	    Stack<Integer> stack = new StackArrayList<>();
        //Stack<Integer> stack = new StackLinkedList<>();

	    try {
            for (int i=0; i<100; i++) {
                stack.push(i);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

	    try {
            System.out.println("Stack is empty? " + stack.isEmpty());

            System.out.println("Top of stack is: " + stack.peek());

            System.out.println("Pop all elements from stack:");
            while(!stack.isEmpty()) {
                System.out.println(stack.pop());
            }

            System.out.println("Stack is empty? " + stack.isEmpty());

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
