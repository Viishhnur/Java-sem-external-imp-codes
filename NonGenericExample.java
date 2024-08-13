import java.util.ArrayList;
import java.util.List;

public class NonGenericExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10); // Integer
        list.add("10"); // String
        
        // Requires type casting
        Integer number = (Integer) list.get(0);
        String text = (String) list.get(1);
    }
}
