public class Calci {

    public class Caluclator{
        int a,b;
        // constructor
        Caluclator(int a,int b){
            this.a = a;
            this.b = b;
        }

        public void add(){
            System.out.println(a+b);
        }

        public void subtract(){
            System.out.println(a-b);
        }
        public void multiply(){
            System.out.println(a*b);
        }
        public void divide(){
            try{
                double div = (double)a/b;
                System.out.println(div);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                // e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        // Create an instance of the outer class
        Calci calci = new Calci();
        
        // Use the instance of the outer class to create an instance of the inner class
        Calci.Caluclator cl = calci.new Caluclator(10, 0);
        cl.add();
        cl.divide();
    }
}
