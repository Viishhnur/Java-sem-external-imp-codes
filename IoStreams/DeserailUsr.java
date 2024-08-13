import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserailUsr {
    public static void main(String[] args){
        
        // Now desiralize and get the data of student
        try{
            FileInputStream fis = new FileInputStream("user.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            User usr = (User)ois.readObject();
            usr.displayDetails(); // since passwd was transient you were getting its default value when u are printing it
            fis.close();
            ois.close();
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    
    }
}
