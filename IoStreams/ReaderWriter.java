// Write a program to read textual data from a info.txt file using reader object of FileReader class


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {
    public static void main(String[] args){
        
        // Now write data into file
        try{
            FileWriter writer = new FileWriter("info.txt",true); // set the append mode to true
            String s = "My name is Viishhnu";

            for(int i = 0; i < s.length();i++){
                writer.write(s.charAt(i));
            }
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        // Now read the data from file
        try{
            FileReader reader = new FileReader("info.txt");
            // this reader obj has read method
            int ch;
            System.out.println("File data is : ");
            while((ch = reader.read()) != -1){
                System.out.print((char)ch);
            }
                
            reader.close();
        }
        catch(IOException  e){
            e.printStackTrace();
        }    

    
    }
}
