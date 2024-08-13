// write a program to write byte by byte reading from a string into a file using fileOutputStream

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataBytes {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("sample.txt");
            String str = "Hello World!\n How are you!!";
            // convert char stream to byte stream
            byte[] data = str.getBytes(); // converts character stream to byte stream

            // Now write byte data into file
            fos.write(data);
            fos.close();
            

        }
        catch(IOException e){
            e.printStackTrace();
        }

    
    }   
}
