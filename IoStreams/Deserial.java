import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args){
        
        try{
            FileInputStream fis = new FileInputStream("obj.txt");   
            ObjectInputStream ois = new ObjectInputStream(fis);
            // After deserialization, we can use the student object
            Student s  = (Student) ois.readObject(); // deseiralization
            s.displayName(); // calling the method of Student class to display the name
            fis.close();
            ois.close();
        }
        catch(IOException  | ClassNotFoundException e){
            e.printStackTrace();
        }
    
    }
}
