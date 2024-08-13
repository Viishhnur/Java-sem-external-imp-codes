import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial{
    public static void main(String[] args) {
    
        // Create a student object
        Student student = new Student("John", "john@gmail.com", 20,"newYork");
        // Now create a file output stream to write into file , this is used to write raw data(bytes) into file
        try
        {
            FileOutputStream fos = new FileOutputStream("obj.txt");

            // Create a object output stream to write object into a file
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);

            fos.close();
            oos.close();
        
            System.out.println("Student object has been serialized to obj.txt");
        }
        catch(IOException e){
            // System.out.println("Error in serialization is " + e.getMessage());
            e.printStackTrace();
        }
    }
}