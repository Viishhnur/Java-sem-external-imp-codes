// import java.util.HashSet;
import java.util.*;
// import java.util.Set;

public class Collections {
    public static void main(String[] args){
        Set<Integer> s = new HashSet<Integer>();
        s.add(10);
        s.add(20);
        s.add(-23);
        s.add(20);
        Iterator<Integer> it = s.iterator();
        // while(it.hasNext()){
        //     System.out.print(it.next() + " ");
        // }
        

        // Tree set is sorted set
        // Set s1 = new TreeSet(s);
        
        HashMap<Integer,Integer> mpp = new HashMap<Integer,Integer>();

        mpp.put(1,2);
        mpp.put(20,12);
        mpp.put(20,-122);

        for(Map.Entry<Integer,Integer> pair  : mpp.entrySet()){
            System.out.println(pair.getKey() + " -> " + pair.getValue() );
        }

        // Print only values
        for(Integer n : mpp.values()){
            System.out.print(n + " ");
        }

        // Stack<Integer> st = new Stack<>(); // obj is of stack 
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(22220);
        // l can only invoke List ka functionality
        System.out.println(st.firstElement());
        }

	public static void sort(List<Employee> employees, Comparator<Employee> comparator) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'sort'");
	}
    
}
