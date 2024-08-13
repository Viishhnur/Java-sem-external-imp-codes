public class ParentChild {
    
    public static void main(String[] args){
        

        try{
            int x = 10/0;
        }
        catch(RuntimeException e){
            System.out.println(e.getLocalizedMessage());
        }   

        // Child class exception should be catched first than catching parent class
        // catch(ArithmeticException e){
        //     System.out.println(e.getLocalizedMessage());
        // } 

    
    }
}
