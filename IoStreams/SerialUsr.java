import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialUsr {
    public static void main(String[] args){
        
        // first create student object and serialize it
        User usr = new User("Viishhnu", "viishhnur@gmail.com", "1234", 19);
        try{
            FileOutputStream fos = new FileOutputStream("user.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Now serialize 
            oos.writeObject(usr);

            fos.close();
            oos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    
    }
}
