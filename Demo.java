class A{
    
    public A(){
        System.out.println("A-constructor object hex code is : "+this);
    }
}
// B is a child class of A
class B extends A{
    
    public B(){
        System.out.println("B-constructor object hex code is : "+this);
    }
}
// this is mutilevel inheritance
class C extends B{
    
    public C(){
        System.out.println("C-constructor object hex code is : "+this);
    }
}
public class Demo {
    
    public static void main(String[] args){
        
        new C();
    
    }
}
