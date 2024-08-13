import java.util.Stack;

public class StAk {
    
    public static void main(String[] args){
        
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Top element is : " + st.peek());
        st.pop();
        System.out.println("Stack after popping : " + st);
        System.out.println("Is stack empty? : " + st.isEmpty());
        System.out.println("Stack size is : " + st.size());
        System.out.println("Stack after adding 40 : " + st.push(40));
        System.out.println(st);
        
    }
}
