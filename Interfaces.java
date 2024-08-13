interface Animal{
    int x = 10;
    void makeSound(); // public , static , final by default

    default void breathe(){
        System.out.println("Can breathe");
    }

    static void run(){
        System.out.println("Can run");
    }
}

class Dog implements Animal  {
    // If this is implemting a interface it must implement all the abstract methods of that interface else it
    // becomes a abstract class itself and we cannot create a object out of it 
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
    // System.out.println(x); // you cannot access variables only methods will be given by interfaces
    
}
public class Interfaces {
    public static void main(String[] args){
        
            // THis is one way of creating object by overriding the abstract methods of interface
            // Animal a = new Animal() {
            //     @Override
            //     public void makeSound() {
            //         System.out.println("Animal makes sound");
            //     }
            // };

            // method-2
            Animal a = new Dog();
            a.makeSound();
            a.breathe();
            Animal.run(); // static method can be called using class name
            System.out.println(Animal.x); // static variable can be called using class name
            // Animal.breathe(); // compile error cannot make static reference
            Animal.run(); // static method can be called using class name

    
    }
}
