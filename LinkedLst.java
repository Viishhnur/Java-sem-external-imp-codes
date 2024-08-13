import java.util.LinkedList;
public class LinkedLst {
    public static void main(String[] args){
    
        LinkedList<Integer> dll = new LinkedList<>();

        for (int i=10 ; i<=100; i+=10) {
            dll.add(i);
        }
        System.out.println("Linked List: "+dll);
        dll.removeFirst(); // pollFirst
        dll.removeLast();

        System.out.println(dll);

        // get the first and last elements now 
        System.out.println("First element: "+dll.getFirst()); // peekFirst 
        System.out.println("Last element: "+dll.getLast());

        // add at any index
        dll.add(0,1000);
        System.out.println(dll);
        // remove 1000
        dll.remove(0);
        System.out.println(dll);
        
    
    }
}
