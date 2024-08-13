import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EnumerationIteratorExample {
    public static void main(String[] args) {
        // Create and populate a Vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Traverse Vector with Enumeration
        System.out.println("Vector using Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // Convert Vector to ArrayList and traverse with Iterator
        List<String> list = new ArrayList<>(vector);
        System.out.println("\nArrayList using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
