import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");
        set.add("Grapes");
        set.add("Apple"); // Duplicate element, will not be added

        // Displaying the HashSet
        System.out.println("HashSet: " + set);

        // Checking if a particular element is in the HashSet
        boolean hasBanana = set.contains("Banana");
        System.out.println("Contains 'Banana': " + hasBanana);

        // Removing an element from the HashSet
        set.remove("Mango");
        System.out.println("After removing 'Mango': " + set);

        // Getting the size of the HashSet
        int size = set.size();
        System.out.println("Size of HashSet: " + size);

        // Checking if the HashSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty: " + isEmpty);

        // Traversing the HashSet using an iterator
        System.out.println("Traversing using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Traversing the HashSet using a for-each loop
        System.out.println("Traversing using for-each loop:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Clearing the HashSet
        set.clear();
        System.out.println("After clearing the HashSet: " + set);
    }
}
