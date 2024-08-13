import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue with natural ordering
        PriorityQueue<String> pq = new PriorityQueue<>(); // java default is min heap

        // Adding elements to the PriorityQueue
        pq.add("Apple");
        pq.add("Banana");
        pq.add("Orange");
        pq.add("Mango");
        pq.add("Grapes");

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // Accessing the head of the PriorityQueue without removing it
        System.out.println("Peek: " + pq.peek());

        // Removing and retrieving the head of the PriorityQueue
        System.out.println("Poll: " + pq.poll());
        System.out.println("After poll: " + pq);

        // Checking the size of the PriorityQueue
        System.out.println("Size of PriorityQueue: " + pq.size());

        // Removing a specific element from the PriorityQueue
        pq.remove("Banana");
        System.out.println("After removing 'Banana': " + pq);

        // Traversing the PriorityQueue using a for-each loop
        System.out.println("Traversing using for-each loop:");
        for (String fruit : pq) {
            System.out.println(fruit);
        }

        // Creating a PriorityQueue with a custom comparator (reverse order)
        PriorityQueue<String> pqCustom = new PriorityQueue<>((a, b) -> b.compareTo(a));
        pqCustom.add("Apple");
        pqCustom.add("Banana");
        pqCustom.add("Orange");
        pqCustom.add("Mango");
        pqCustom.add("Grapes");

        // Displaying the PriorityQueue with custom ordering
        System.out.println("PriorityQueue with custom ordering: " + pqCustom);

        // Removing all elements from the PriorityQueue
        pqCustom.clear();
        System.out.println("After clearing the custom PriorityQueue: " + pqCustom);
    }
}
