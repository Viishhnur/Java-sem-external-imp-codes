class Demo{
    public static void main(String[] args){
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = i+1;
        }
        // Nested try block and multiple catch blocks
        try{
            System.out.println("In 1st try block --> Before exception");
            // int res = 5/0;

            try{
                System.out.println("In inner try block");
                arr[6] = 10/0;
                // Since there is no corresponding catch block which can handle this division by 0 exception
                // the exception propagates parent try ka catch and checks whether it is able to handle or not
                // this is called as Exception propagation
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("In inner catch block");
                System.out.println(e.getMessage());
            }
            System.out.println("After inner try block --> After exception");

            
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ // catching two exceptions on same line
            
           
            System.out.println(e.getMessage());
            System.out.println("In catch block --> After printing exception");

        }     
        // catch(ArithmeticException e){
        //     System.out.println(e.getMessage());
        // }
        finally{
            System.out.println("In finaly --> hamesha execute hoga");
        }
    
    }
}