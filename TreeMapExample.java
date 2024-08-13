import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put("Apple", 3);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 5);
        treeMap.put("Date", 7);

        // Displaying the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Accessing elements
        System.out.println("Value for 'Banana': " + treeMap.get("Banana"));

        // Removing an element
        treeMap.remove("Date");
        System.out.println("TreeMap after removing 'Date': " + treeMap);

        // Navigating the map
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());
        System.out.println("Ceiling Key for 'Blueberry': " + treeMap.ceilingKey("Blueberry"));
        System.out.println("Floor Key for 'Blueberry': " + treeMap.floorKey("Blueberry"));

        // Traversing using for-each loop
        System.out.println("\nTraversing TreeMap using for-each loop:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
