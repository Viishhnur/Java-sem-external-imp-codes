import java.util.*;
public class ArrayLst {
    public static void main(String[] args){
        
        List<Integer> lst = new ArrayList<>();

        for (int i=10 ; i<=100 ; i+=10) {
            lst.add(i);
        }
        System.out.println(lst);
        System.out.println("Last element is : " + lst.get(lst.size()-1)); 

        // add at any index
        lst.add(0,1000);
        System.out.println(lst);
        // remove 1000
        lst.remove(0);
        System.out.println(lst);

    
    }
}
