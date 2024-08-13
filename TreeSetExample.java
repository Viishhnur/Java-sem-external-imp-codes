import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> set = new TreeSet<>();

        // Adding elements to the TreeSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");
        set.add("Grapes");
        set.add("Apple"); // Duplicate element, will not be added

        // Displaying the TreeSet
        System.out.println("TreeSet: " + set);

        // Checking if a particular element is in the TreeSet
        boolean hasBanana = set.contains("Banana");
        System.out.println("Contains 'Banana': " + hasBanana);

        // Removing an element from the TreeSet
        set.remove("Mango");
        System.out.println("After removing 'Mango': " + set);

        // Getting the size of the TreeSet
        int size = set.size();
        System.out.println("Size of TreeSet: " + size);

        // Checking if the TreeSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is TreeSet empty: " + isEmpty);

        // Getting the first and last elements
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // Traversing the TreeSet using an iterator
        System.out.println("Traversing using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Traversing the TreeSet using a for-each loop
        System.out.println("Traversing using for-each loop:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Getting a subset
        System.out.println("Subset from 'Banana' to 'Orange': " + set.subSet("Banana", "Orange"));

        // Getting headSet and tailSet
        System.out.println("HeadSet up to 'Orange': " + set.headSet("Orange"));
        System.out.println("TailSet from 'Banana': " + set.tailSet("Banana"));

        // Clearing the TreeSet
        set.clear();
        System.out.println("After clearing the TreeSet: " + set);
    }
}
