import java.util.HashMap;
import java.util.Map;


public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);

        // Retrieve and print values
        System.out.println("Value for 'Apple': " + map.get("Apple"));
        System.out.println("Value for 'Banana': " + map.get("Banana"));

        // Check if a key exists
        System.out.println("Contains 'Cherry': " + map.containsKey("Cherry"));

        // Check if a value exists
        System.out.println("Contains value 4: " + map.containsValue(4));

        // Remove a key-value pair
        map.remove("Date");

        // Traverse the HashMap using entrySet()
        System.out.println("\nTraversing HashMap using entrySet:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Traverse the HashMap using keySet()
        System.out.println("\nTraversing HashMap using keySet:");
        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }

        // Traverse the HashMap using values()
        System.out.println("\nTraversing HashMap using values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // Get the size of the HashMap
        System.out.println("\nSize of HashMap: " + map.size());

        // Clear the HashMap
        map.clear();
        System.out.println("HashMap after clearing: " + map);
    }
}
