abstract class Car{
    abstract public void drive();
    public void playMusic(){
        System.out.println("Playing music");
    }

}
class Altok10 extends Car{
    @Override
    public void drive(){
        System.out.println("Driving Altok10");
    }
}
public class Abstraction {
    public static void main(String[] args){
        
        // Car car = new Car(); we cannot create object of abstract class
        Car alto = new Altok10();
        alto.drive();
        alto.playMusic(); // Polymorphism, method overriding occurs here. 
        
        // Abstract class can't be instantiated
        // Car car2  = new Car(); // Compilation error
        
        // Abstract class can't have abstract methods
        // abstract void stop(); // Compilation error
    
    }
}
