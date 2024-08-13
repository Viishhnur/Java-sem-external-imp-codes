import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the ArrayDeque
        deque.addLast("Apple");
        deque.addLast("Banana");
        deque.addLast("Cherry");
        deque.addFirst("Mango");
        deque.addFirst("Grapes");

        // Displaying the ArrayDeque
        System.out.println("ArrayDeque: " + deque);

        // Accessing elements without removing
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        // Removing elements
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());
        System.out.println("After removals: " + deque);

        // Adding more elements
        deque.offerLast("Orange");
        deque.offerFirst("Pineapple");

        // Traversing the ArrayDeque using a for-each loop
        System.out.println("Traversing using for-each loop:");
        for (String fruit : deque) {
            System.out.println(fruit);
        }

        // Clearing the ArrayDeque
        deque.clear();
        System.out.println("After clearing the ArrayDeque: " + deque);
    }
}
